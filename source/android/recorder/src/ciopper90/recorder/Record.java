package ciopper90.recorder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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
	private boolean active;
	private Context context;
	private String evento;
	private AndNotification n;
	// Costante relativa al nome della particolare preferenza
	private final static String TEXT_DATA_KEY = "number";
	SharedPreferences prefs;

	public Record(Context cont,SharedPreferences shared){

		//inizializzazione variabili generali
		int channelConfig=AudioFormat.CHANNEL_IN_MONO;
		int audioFormat=AudioFormat.ENCODING_PCM_16BIT;
		context=cont;
		prefs = shared;

		size=prefs.getInt("n", 0)*24*1024;
		audioBuffer=new byte[size];

		bufferSize=size;
		audioRecord = new AudioRecord(MediaRecorder.AudioSource.MIC,sampleRateInHz, channelConfig, audioFormat, bufferSize);
		//n= new AndNotification();

	}

	public void run(){
		int i=0;
		byte [][] temp=new byte[(audioBuffer.length/bufferSize)][bufferSize];
		Log.d("dimensione", (audioBuffer.length/bufferSize) + "");
		Log.d(bufferSize+"", audioBuffer.length+"");
		while(true){
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
			try {
				// Leggiamo l'informazione associata alla proprietà TEXT_DATA
				textData= prefs.getInt(TEXT_DATA_KEY, 0);
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
				editor.commit();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}



			i=0;
			Log.d("thread", "end record");
			Log.d("thread", "start elaborazione");
			Log.d("thread", "stop elaborazione");
			int [] d=Feature.feature(audioBuffer,sampleRateInHz,context,textData);			
			//calcolo della media dei 3 vettori

			//istanzio vettore
			int [] count=new int[7];
			for(int n=0;n<count.length;n++)
				count[n]=0;

			//incremento in base alle occorrenze
			for(int n=0;n<d.length;n++){
				count[d[n]]++;
			}
			//cerco massima
			int max=0,element=0;
			for(int n=0;n<count.length;n++){
				if(count[n]>max){
					max=count[n];
					element=n;
				}
			}

			String [] elemento={"parco","lezione","treno","tv","auto","ristorante","strada"};
			String scelta=elemento[element];

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
		}
	}
}
