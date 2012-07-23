package ciopper90.recorder;


import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Main extends Activity {
	//variabili di configurazione
	private Thread work;
	// Identificatore delle preferenze dell'applicazione
	private final static String MY_PREFERENCES = "MyPref";
	private SharedPreferences prefs;
	private ListView listView;
	private ArrayList<Event> ListEvent;
	private MyDatabase db;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		prefs=this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
		//inizializziamo shared preferences
		SharedPreferences.Editor editor = prefs.edit();
		// Lo salviamo nelle Preferences
		//lunghezza campione
		editor.putInt("n", 2);
		//tempo tra due acquisizioni
		editor.putInt("m", 10);
		//sample per campione
		editor.putInt("q", 3);
		//tempo tra due campionamenti diversi
		editor.putInt("h", 60);
		editor.commit();	
		db=new MyDatabase(this.getApplicationContext());
		work=new Record(getApplicationContext(),prefs);
		work.start();
		
	}   
	/*
	private void aggiornalist() {
		ListEvent=CaricaEvent();
		if(ListEvent==null){
			ListEvent=new ArrayList<Event>();
		}


		//Questa è la lista che rappresenta la sorgente dei dati della listview
		//ogni elemento è una mappa(chiave->valore)
		ArrayList<HashMap<String, Object>> data=new ArrayList<HashMap<String,Object>>();

		HashMap<String,Object> ServiceMap=new HashMap<String, Object>();//creiamo una mappa di valori

		for(int i=0;i<ListEvent.size();i++){
			Event e=ListEvent.get(i);// per ogni persona all'inteno della ditta

			ServiceMap=new HashMap<String, Object>();//creiamo una mappa di valori

			ServiceMap.put("evento", e.getEvento()); // per la chiave image, inseriamo la risorsa dell immagine
			ServiceMap.put("tempo", e.getTempo());
			
			data.add(ServiceMap);  //aggiungiamo la mappa di valori alla sorgente dati
		}


		String[] from={"evento","tempo"}; //dai valori contenuti in queste chiavi
		int[] to={R.id.classify,R.id.time};//agli id delle view

		//costruzione dell adapter
		SimpleAdapter adapter=new SimpleAdapter(
				getApplicationContext(),
				data,//sorgente dati
				R.layout.news, //layout contenente gli id di "to"
				from,
				to);

		//utilizzo dell'adapter
		((ListView)findViewById(R.id.element)).setAdapter(adapter);
		listView=(ListView)findViewById(R.id.element);
	}

	private ArrayList<Event> CaricaEvent() {
	 		db.open();
	 		Cursor c=db.fetchEvent(); // query
	        startManagingCursor(c);
	       ArrayList<SMS> a = new ArrayList<SMS>();
	       int i=0;
	         while(c.moveToNext()&&i<20){
	        	 i++;
	         	a.add(new SMS(Integer.parseInt(c.getString(0)),c.getString(1),c.getString(2),c.getString(3)));
	         	}
	        c.close();
	        db.close();
		return null;
	}
	
	*/
	
}