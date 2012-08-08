

import java.util.HashMap;
import java.util.Map;

import edu.emory.mathcs.jtransforms.fft.DoubleFFT_1D;


public class Feature {

	public static double[] feature(Sample s){
		//int [][] sample=extract_sample(audio,sample_rate,pref);
		double[] c=new double[4];



		//MyDatabase db=new MyDatabase(context);
		//GregorianCalendar data= new GregorianCalendar(); 
		c[2]=ZeroCrossingRate(s.getCamp());
		//double zcr=(Double) c[1];

		c[1]=LowEnergyFrameRate(s.getCamp());
		//double lefr=(Double) c[0];

		c[0]=SpectralCentroid(s.getCamp(), 11025);

		c[3]=ShannonEntropy(s.getCamp());
		//double entropy=(Double) c[2];

		return c;
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
