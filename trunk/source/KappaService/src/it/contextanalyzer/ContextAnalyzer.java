package it.contextanalyzer;


import it.kappa.Event;
import it.kappa.Kappa;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ContextAnalyzer extends IntentService{
	
	private static Context context;
	
	public ContextAnalyzer(){
		super("KappaService");
	}
	
    @Override
	public void onCreate(){
    	super.onCreate();
    	context = getApplicationContext();
	    
    }
    
    public int onStartCommand (Intent intent, int flags, int startId){
    	Log.d("kappaService", "started");
    	return super.onStartCommand(intent,flags,startId);    	
   }
    
	@Override
	protected void onHandleIntent(Intent arg0) {
		
		Kappa kappa = new Kappa(context);
		kappa.run();
		
		Event classification = kappa.getClassification();
		Log.d("kappaService", "Classification = "+classification);
	}

	
	

}
