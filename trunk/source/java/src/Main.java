import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;


public class Main {
	public static void main(String args[]){
		//File f=new File("d:\\data.raw");
		HashMap<Integer, Sample> m=new HashMap<Integer, Sample>();
		try {
			Reader t=new FileReader("d:\\data.raw");
			BufferedReader b=new BufferedReader(t);
			String c="";
			int i=0;
			while((c=b.readLine()) != null){
				String a[]=c.split(",");
				Sample s=new Sample();
				s.setName(a[1]);
				s.setClasse(a[2]);
				s.setCamp(a[0]);
				m.put(i,s);
				i=i+1;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String out="";
		for(int i=0;i<m.size();i++){
			Sample c=(Sample) m.get(i);
			//System.out.println(c.getName());
			double[] d=Feature.feature(c);
			out=out.concat(d[0]+","+d[1]+","+d[2]+","+d[3]+","+c.getName()+","+c.getClasse()+"\n");
		}
		try {
			BufferedWriter wri=new BufferedWriter(new FileWriter("d:\\test.arff"));
			wri.write(out);
			wri.flush();
			wri.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
