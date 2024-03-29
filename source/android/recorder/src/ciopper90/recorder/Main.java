package ciopper90.recorder;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Main extends Activity {
	//variabili di configurazione
	private static Record work;
	// Identificatore delle preferenze dell'applicazione
	private final static String MY_PREFERENCES = "MyPref";
	private SharedPreferences prefs;
	private ListView listView;
	private ArrayList<Event> ListEvent;
	private MyDatabase db;
	private Handler mHandler;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		prefs=this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
		//inizializziamo shared preferences
		SharedPreferences.Editor editor = prefs.edit();
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
		db=new MyDatabase(this.getApplicationContext());
		//se non esiste il thread lo creo
		if(work==null){
			mHandler=new MyHandler();
			work=new Record(getApplicationContext(),prefs,mHandler);
			work.start();
		}
		if(work.isalt()){
			work.restart();
			work.start();
		}
		aggiornalist();
	}   

	private class MyHandler extends Handler {
		@Override
		public void handleMessage(Message msg) {
			Bundle bundle = msg.getData();
			aggiornalist();
		}
	}

	public void aggiornalist() {
		//Log.d("aggiorna", "eseguito");
		ListEvent=CaricaEvent();
		//Log.d("elementi", ListEvent.size()+"");
		if(ListEvent==null){
			ListEvent=new ArrayList<Event>();
		}
		ListEvent=unione(ListEvent);
		//Questa è la lista che rappresenta la sorgente dei dati della listview
		//ogni elemento è una mappa(chiave->valore)
		ArrayList<HashMap<String, String>> data=new ArrayList<HashMap<String,String>>();

		HashMap<String,String> ServiceMap=new HashMap<String, String>();//creiamo una mappa di valori

		for(int i=0;i<ListEvent.size();i++){
			Event e=ListEvent.get(i);// per ogni persona all'inteno della ditta

			ServiceMap=new HashMap<String, String>();//creiamo una mappa di valori

			ServiceMap.put("evento", e.getEvento()+" ( "+e.getPerc()+"% )"); // per la chiave image, inseriamo la risorsa dell immagine
			ServiceMap.put("tempo", e.getInizio()+" - "+e.getFine());

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

	private ArrayList<Event> unione(ArrayList<Event> list) {
		int k=0;
		ArrayList<Event> ret=new ArrayList<Event>();
		//se dimensione >=1 setto il primo elemento della lista altrimenti ritorno una lista vuota
		if(list.size()>=1){
			ret.add(list.get(0));
			ret.get(0).setFine("");
		}else{
			return ret;
		}

		for(int i=1;i<list.size();i++){
			//unisce due elementi con stesso evento e orari coincidenti
			if(list.get(i).getEvento().equals(ret.get(k).getEvento()) &&  (list.get(i).getFine().equals(ret.get(k).getInizio()))){
				ret.get(k).setInizio(list.get(i).getInizio());
				ret.get(k).setPerc((ret.get(k).getCampioni()*Double.parseDouble(ret.get(k).getPerc())+list.get(i).getCampioni()*Double.parseDouble(list.get(i).getPerc()))/(list.get(i).getCampioni()+ret.get(k).getCampioni()));
				ret.get(k).setCampioni(list.get(i).getCampioni()+ret.get(k).getCampioni());
			}else{
				//aggiunge un nuovo elemento alla lista
				ret.add(list.get(i));
				k++;
			}
		}

		return ret;
	}

	//funzione che legge dal db e carica gli eventi
	private ArrayList<Event> CaricaEvent() {
		db.open();
		Cursor c=db.fetchEvents(); // query
		startManagingCursor(c);
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

	//menu con tasto aggiorna
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		super.onCreateOptionsMenu(menu);
		int order = Menu.FIRST;
		int GROUPA = 0;
		menu.add(GROUPA,order,order++,"Refresh").setIcon(R.drawable.ic_menu_refresh);	
		menu.add(GROUPA,order,order++,"Quit").setIcon(android.R.drawable.ic_menu_close_clear_cancel);	
		return true;
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getTitle().equals("Refresh")){
			aggiornalist();
			return true;}
		if(item.getTitle().equals("Quit")){
			work.alt();
			this.finish();
		}
		return true;
	}




}

