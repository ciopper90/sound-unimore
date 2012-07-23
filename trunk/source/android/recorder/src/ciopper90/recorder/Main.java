package ciopper90.recorder;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
//import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
	//variabili di configurazione
	Thread work;
	// Identificatore delle preferenze dell'applicazione
	private final static String MY_PREFERENCES = "MyPref";


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		work=new Record(getApplicationContext(),this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE));

		Button inizia = (Button) this.findViewById(R.id.inizio);
		Button ferma = (Button) this.findViewById(R.id.fine);
		inizia.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				work.start();
			}
		});
		ferma.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AndNotification a=new AndNotification();
				a.notify("haha", getApplicationContext());
			}
		});
		/*
		rilascia.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
			//	tv.setText(r.r_close());
			}
		});
		 */
	}   
	/*@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)  {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			if(work.getState()==Thread.State.TERMINATED)
				return super.onKeyDown(keyCode, event);
			else
				work.destroy();
				return true;
		}

		return super.onKeyDown(keyCode, event);
	}*/


}