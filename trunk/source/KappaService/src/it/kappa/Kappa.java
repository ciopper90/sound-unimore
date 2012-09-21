package it.kappa;

import java.util.ArrayList;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.util.Log;

/**
 * This class instantiates the Kappa library for the classification of
 * situation based on Audio data.  
 * 
 * @author Gabriella Castelli (UNIMORE)
 *
 */
public class Kappa extends Thread{
	
	/**
	 * The Android Application Context
	 */
	private Context context;
	
	
	/**
	 * The identifier for Kappa Shared Preferences
	 */
	private final static String KAPP_PREFERENCES = "KappaPreferences";
	
	
	/**
	 * The reference to the Android shared preferences
	 */
	private SharedPreferences preferences;
	
	/**
	 * The reference to the Kappa Database
	 */
	private Database db;
	
	
	/**
	 * The reference to the Audio Recorder
	 */
	private static Thread recorder;
	
	/**
	 * True if classifications are available, i.e., Kappa run for at least 1 minute
	 */
	private boolean noClassificationAvailable;
	
	/**
	 * Constructor
	 * 
	 * @param context The Android Application Context
	 */
	public Kappa(Context context){
		this.context = context;
		
		preferences = context.getSharedPreferences(KAPP_PREFERENCES, Context.MODE_PRIVATE);
		
		//inizializziamo shared preferences
		SharedPreferences.Editor editor = preferences.edit();
		// Lo salviamo nelle Preferences
		//lunghezza campione
		editor.putInt("n", 3);
		//tempo tra due acquisizioni
		editor.putInt("m", 10);
		//sample per campione
		editor.putInt("q", 4);
		//tempo tra due campionamenti diversi
		editor.putInt("h", 60);
		editor.commit();	
		
		noClassificationAvailable = true;
		
		db=new Database(context.getApplicationContext());
	}
	
	
	@Override
	public void run(){
		recorder=new Recorder(context.getApplicationContext(),preferences);
		recorder.start();
	}
	
	/**
	 * Returns the current classification
	 * 
	 * @return an Event with the current classification
	 */
	public  Event getClassification(){
		Event ret = null;
		
		Log.d("kappaService", "Classification requested");
		
		//Wait for the first classification to be available
		if(noClassificationAvailable == true){
			try {
				sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			noClassificationAvailable = false;
			
		}
		
			
		ArrayList<Event> ListEvent = null;
		ListEvent = loadEvents();
		
		if( ListEvent==null )
			ListEvent = new ArrayList<Event>();
		
		
		ListEvent = union (ListEvent);
		
		ret = ListEvent.get(0);
		//ret = e.getEvento()+" "+e.getPerc()+"% "+e.getInizio()+" "+e.getFine();
		
		return ret;
	}
	
	private ArrayList<Event> union (ArrayList<Event> list) {
		int k=0;
		ArrayList<Event> ret=new ArrayList<Event>();
		if(list.size()>=1){
			ret.add(list.get(0));
			ret.get(0).setFine("");
		}else{
			return ret;
		}
		
		for(int i=1;i<list.size();i++){
			if(list.get(i).getEvent().equals(ret.get(k).getEvent()) &&  (list.get(i).getFine().equals(ret.get(k).getInizio()))){
				ret.get(k).setInizio(list.get(i).getInizio());
				ret.get(k).setPercentuale((ret.get(k).getCampioni()*Double.parseDouble(ret.get(k).getPercentuale())+list.get(i).getCampioni()*Double.parseDouble(list.get(i).getPercentuale()))/(list.get(i).getCampioni()+ret.get(k).getCampioni()));
				ret.get(k).setCampioni(list.get(i).getCampioni()+ret.get(k).getCampioni());
			}else{
				ret.add(list.get(i));
				k++;
			}
		}

		return ret;
	}

	private ArrayList<Event> loadEvents() {
		db.open();
		Cursor c=db.fetchEvents(); 
		ArrayList<Event> a = new ArrayList<Event>();
		int i=0;
		while(c.moveToNext()&&i<40){
			a.add(new Event(c.getString(1),c.getString(4),c.getString(3)));
			i++;
		}
		c.close();
		db.close();
		return a;
	}
	
	

}
