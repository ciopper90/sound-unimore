package ciopper90.recorder;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import edu.emory.mathcs.jtransforms.fft.*;
import android.content.Context;
import android.content.SharedPreferences;

public class Feature {

	public static int[] feature(byte[] audio,int sample_rate,Context context,int numb,SharedPreferences pref){
		int [][] sample=extract_sample(audio,sample_rate,pref);
		Object[] c=new Object[4];
		int [] h=new int[sample.length];
		


		MyDatabase db=new MyDatabase(context);
		GregorianCalendar data= new GregorianCalendar(); 


		for(int n=0;n<sample.length;n++){
			c[2]=ZeroCrossingRate(sample[n]);
			double zcr=(Double) c[2];
			
			c[1]=LowEnergyFrameRate(sample[n]);
			double lefr=(Double) c[1];
		    
			c[0]=SpectralCentroid(sample[n], sample_rate);
			double centroid=(Double) c[0];
			
			c[3]=ShannonEntropy(sample[n]);
			double entropy=(Double) c[3];
			
			//Log.d("campione "+n, a[n][0]+" "+a[n][1]+ " "+ centroid);//+" "+a[2]);
			//Log.d("shannon",c[2]+"");
			String [] elemento={"parco","lezione","treno","tv","auto","ristorante","strada"};

			try {
				db.open();  //apriamo il db
				h[n]=WekaClassifier1.classify(c);
				//Log.d("classify", elemento[h[n]]);
				//Log.d("data ora", data.getTime().getDate()+"/"+data.getTime().getMonth()+"/"+data.getTime().getYear() +" "+data.getTime().getHours()+":"+data.getTime().getMinutes()+"."+data.getTime().getSeconds());
				db.insertSample( elemento[h[n]],zcr,lefr,centroid,entropy,numb,n,data.getTime().getDate()+"/"+data.getTime().getMonth()+"/"+data.getTime().getYear(),data.getTime().getHours()+":"+data.getTime().getMinutes()+"."+data.getTime().getSeconds());
				db.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return h;
	}

	private static int[][] extract_sample(byte[] audio,int sample_rate, SharedPreferences pref) {
		//number of sample
		int number_sample=pref.getInt("q", 3);
		//time of sample
		double time=0.064;
		//number of frame in a sample
		int number_rate=(int) (time*sample_rate);

		int [][] temp=new int[number_sample][number_rate];
		int n=0;
		int frame=audio.length/number_sample;
		audio[1]=-1;
		for(int i=0;i<number_sample;i++){
			for(int k=0;k<number_rate;k++){
				temp[i][k]=audio[n+1];//+1 e la parte + alta
				temp[i][k]=(temp[i][k]<<8)+audio[n];
				n+=2;
			}
			n=n+frame;

		}
		return temp;
	}

	private static double LowEnergyFrameRate(int[] audio) {
		//Log.d("a", audio.length+"");
		double sum=0;
		for(int i=0;i<audio.length-1;i++)
			sum=sum+(Math.pow(audio[i],2));
		sum=sum/audio.length;
		double rms=Math.sqrt(sum)/2;
		int lefr=0;
		for(int i=0;i<audio.length;i++){
			if(audio[i]<rms){
				lefr++;
			}
		}
		return lefr;
	}

	private static double SpectralCentroid(int[] audio, int sample_rate) {

		DoubleFFT_1D d=new DoubleFFT_1D(audio.length);
		//trasformata di laplace del segnale audio
		double[] fftTempArray = new double[audio.length];
		for (int i=0; i<audio.length; i++)
		{
			fftTempArray[i] = audio[i];
		}
		d.realForward(fftTempArray);


		//p = np.abs(np.fft.rfft(signal))
		for(int i=0;i<audio.length;i++){
			fftTempArray[i]=Math.abs(fftTempArray[i]);
		}
		//fine trasformata di laplace del segnale audio

		//f = np.linspace(0, sample_rate / 2.0, len(p))
		Linspace counter = new Linspace(0,sample_rate/2,fftTempArray.length);
		double[] lin=new double[audio.length];
		int i=0;
		while(i<audio.length) {
			lin[i]=counter.getNextFloat();
			i++;
		}
		/* 	    num = den = 0.0
        	    for i in range(len(f)):
        	        num = num + (i * (p[i] * p[i]))
        	    for i in range(len(f)):
        	        den = den + ((p[i] * p[i]))

        	    sample['sc'] = num / den
		 */
		double num=0,den=0;
		for(i=0;i<audio.length;i++){
			num=num+i*(fftTempArray[i]*fftTempArray[i]); 	
		}
		for(i=0;i<audio.length;i++){
			den=den+(fftTempArray[i]*fftTempArray[i]); 	
		}
		return num/den;
	}
	
	
	public static double ShannonEntropy(int[] audio) {
		  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		  // count the occurrences of each value
		  for (int i=0;i<audio.length;i++) {
		    if (!map.containsKey(audio[i])) {
		      map.put(audio[i], 0);
		    }
		    map.put(audio[i], map.get(audio[i]) + 1);
		  }

		  // calculate the entropy
		  Double result = 0.0;
		  for (Integer sequence : map.keySet()) {
		    Double frequency = (double) map.get(sequence)/ audio.length;
		    result -= frequency * (Math.log(frequency) / Math.log(2));
		  }

		  return result;
		}

	

	private static double ZeroCrossingRate(int[] audio) {
		int prima=audio[0];
		int dopo;
		double zcr=0;
		for(int i=1;i<audio.length-1;i++){
			dopo=audio[i];
			zcr=zcr+Math.abs((Math.signum(dopo)-Math.signum(prima)));
			prima=dopo;
		}
		zcr=zcr/(2*audio.length);
		return zcr;
	}
}
