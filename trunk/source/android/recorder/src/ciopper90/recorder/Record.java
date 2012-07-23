package ciopper90.recorder;

import java.util.GregorianCalendar;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.util.Log;

public class Record extends Thread{

	private final int bufferSize;
	private final AudioRecord audioRecord;
	private int size;
	private final byte[] audioBuffer;
	private int sampleRateInHz=11025;
	private Context context;
	private String evento;
	private AndNotification n;
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
		//n= new AndNotification();
		db=new MyDatabase(cont);


	}

	public void run(){
		int i=0,k=0;
		byte [][] temp=new byte[(audioBuffer.length/bufferSize)][bufferSize];
		Log.d("dimensione", (audioBuffer.length/bufferSize) + "");
		Log.d(bufferSize+"", audioBuffer.length+"");
		while(true){
			if(k==0)
				data_start= new GregorianCalendar();
			long start=System.currentTimeMillis();
			Log.d("thread", "start record");
			while(audioBuffer.length>i*bufferSize){
				audioRecord.startRecording();
				audioRecord.read(temp[i], 0, bufferSize);
				audioRecord.stop();
				i++;
			}
			for(int a=0;a<audioBuffer.length;a++){
				int indice=a/bufferSize;
				audioBuffer[a]=temp[indice][a-indice*bufferSize];				
			}	
			int textData = 0;
			// Leggiamo l'informazione associata alla proprietà TEXT_DATA
			/*textData= prefs.getInt(TEXT_DATA_KEY, 0);
			if(k==0){
				primo=textData;
			}
			// create a File object for the parent directory
				File wallpaperDirectory = new File("/sdcard/reco/");
				// have the object build the directory structure, if needed.
				wallpaperDirectory.mkdirs();
				// create a File object for the output file
				File outputFile = new File(wallpaperDirectory, textData+".raw");
				// now attach the OutputStream to the file object, instead of a String representation
				FileOutputStream fos = new FileOutputStream(outputFile);
				fos.write(audioBuffer);
				fos.flush();
				fos.close();
			SharedPreferences.Editor editor = prefs.edit();
			// Lo salviamo nelle Preferences
			editor.putInt(TEXT_DATA_KEY, ++textData);
			editor.commit();*/


			i=0;
			Log.d("thread", "end record");
			Log.d("thread", "start elaborazione");
			Log.d("thread", "stop elaborazione");
			sample_value[k]=Feature.feature(audioBuffer,sampleRateInHz,context,textData,prefs);			


			String [] elemento={"parco","lezione","treno","tv","auto","ristorante","strada"};
			//String scelta=elemento[element];

			/*/if(evento==null){
				n.notify(scelta, context);		
			}else{
				if(evento!=scelta){
					n.notify(scelta, context);		
					evento=scelta;
				}
			}*/
			long stop=System.currentTimeMillis();
			try {
				sleep((prefs.getInt("m", 10)*1000)-(stop-start));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			k++;
			if(k==sample_value.length){
				//data_end= new GregorianCalendar();
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

				String inizio=data_start.getTime().getHours()+":"+data_start.getTime().getMinutes();
				//String fine=data_end.getTime().getHours()+data_end.getTime().getMinutes()+"";
				textData= prefs.getInt(TEXT_DATA_KEY, 0);
				SharedPreferences.Editor editor = prefs.edit();
				// Lo salviamo nelle Preferences
				editor.putInt(TEXT_DATA_KEY, textData+1);
				editor.commit();
				double percentuale=((double) max)/(sample_value.length*sample_value[0].length);
				if(percentuale>0.5){
					db.insertEvent(elemento[element], textData, percentuale, inizio);
				}
				else{
					//scrivi unknown
					db.insertEvent("unknown", textData, percentuale, inizio);
				}
				db.close();
				k=0;
			}
		}
	}
}
