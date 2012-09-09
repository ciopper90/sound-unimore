package ciopper90.recorder;

import java.util.GregorianCalendar;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.SystemClock;
import android.util.Log;

public class Record extends Thread{

	private final int bufferSize;
	private static AudioRecord audioRecord;
	private int size;
	private final byte[] audioBuffer;
	private int sampleRateInHz=11025;
	private Context context;
	// Costante relativa al nome della particolare preferenza
	private final static String TEXT_DATA_KEY = "number";
	SharedPreferences prefs;
	private int[][] sample_value;
	private MyDatabase db;
	GregorianCalendar data_start,data_end;



	public Record(Context cont,SharedPreferences shared){

		//inizializzazione variabili generali
		int channelConfig=AudioFormat.CHANNEL_IN_MONO;
		int audioFormat=AudioFormat.ENCODING_PCM_16BIT;
		context=cont;
		prefs = shared;
		size=prefs.getInt("n", 0)*24*1024;
		audioBuffer=new byte[size];
		sample_value=new int[prefs.getInt("h", 60)/prefs.getInt("m", 10)][];

		bufferSize=size;
		audioRecord = new AudioRecord(MediaRecorder.AudioSource.MIC,sampleRateInHz, channelConfig, audioFormat, bufferSize);
		db=new MyDatabase(cont);


	}

	public void run(){
		int textData = 0;
		long time=0;
		int i=0,k=0;
		byte [][] temp=new byte[(audioBuffer.length/bufferSize)][bufferSize];
		//Log.d("dimensione", (audioBuffer.length/bufferSize) + "");
		//Log.d(bufferSize+"", audioBuffer.length+"");
		while(true){
			if(k==0)
				data_start= new GregorianCalendar();
			long start=System.currentTimeMillis();
			//start audio record
			while(audioBuffer.length>i*bufferSize){
				audioRecord.startRecording();
				audioRecord.read(temp[i], 0, bufferSize);
				audioRecord.stop();
				i++;
			}
			//finish audio record
			//trasportare i byte letti in un unico vettore
			for(int a=0;a<audioBuffer.length;a++){
				int indice=a/bufferSize;
				audioBuffer[a]=temp[indice][a-indice*bufferSize];				
			}


			i=0;
			//start elaborazione
			sample_value[k]=Feature.extractFeature(audioBuffer,sampleRateInHz,context,textData,prefs);			


			String [] elemento={"parco","lezione","treno","tv","auto","ristorante","strada"};
			long stop=System.currentTimeMillis();
			//Log.d("time", time+"");
			SystemClock.sleep((prefs.getInt("m", 10)*1000)-(stop-start));
			time=time+10;
			k++;
			if(k==sample_value.length){
				Log.d("time", time+"");
				//calcolo della media dei 3 vettori
				//istanzio vettore
				int [] count=new int[7];
				for(int n=0;n<count.length;n++)
					count[n]=0;

				//incremento in base alle occorrenze
				for(int m=0;m<sample_value.length;m++){
					for(int n=0;n<sample_value[m].length;n++){
						count[sample_value[m][n]]++;
					}
				}

				//cerco massima
				int max=0,element=0;
				for(int n=0;n<count.length;n++){
					if(count[n]>max){
						max=count[n];
						element=n;
					}
				}
				db.open();
				String inizio="";
				if(data_start.getTime().getMinutes()<=9){
					inizio=data_start.getTime().getHours()+":0"+data_start.getTime().getMinutes();
				}else{
					inizio=data_start.getTime().getHours()+":"+data_start.getTime().getMinutes();
				}
				textData= prefs.getInt(TEXT_DATA_KEY, 0);
				SharedPreferences.Editor editor = prefs.edit();
				// Lo salviamo nelle Preferences
				editor.putInt(TEXT_DATA_KEY, ++textData);
				editor.commit();
				double percentuale=((double) max)/(sample_value.length*sample_value[0].length);
				db.insertEvent(elemento[element], textData, (int) (percentuale*100), inizio);
				db.close();
				k=0;
				time=0;           
			}
		}
	}
}
