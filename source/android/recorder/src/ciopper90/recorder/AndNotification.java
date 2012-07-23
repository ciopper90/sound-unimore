package ciopper90.recorder;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class AndNotification{
	
	
	private static final int NOTIFICATION_ID = 1;
	NotificationManager mNotificationManager;
	int i=0,n=0;
	
	
	public void notify(String text,Context context) {
		String ns = Context.NOTIFICATION_SERVICE;
		mNotificationManager = (NotificationManager) context.getSystemService(ns);
		int icon = android.R.drawable.stat_notify_chat;
		CharSequence tickerText = "Cambio Evento";
		long when = System.currentTimeMillis();
		Notification notification = new Notification(icon, tickerText, when);
		CharSequence contentTitle = "Titolo della mia notifica";
		CharSequence contentText = text;
		//Intent notificationIntent = new Intent(this, TutorialNotification.class);
		//PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0);
		Intent notificationIntent = new Intent();
		PendingIntent contentIntent = PendingIntent.getActivity(context, icon, notificationIntent, icon);
		notification.setLatestEventInfo(context, contentTitle, contentText, contentIntent);

		//notification.defaults |= Notification.DEFAULT_SOUND;	//Suona
		//notification.defaults |= Notification.DEFAULT_LIGHTS;	//LED
		//notification.defaults |= Notification.DEFAULT_VIBRATE;	//Vibra

		mNotificationManager.notify(NOTIFICATION_ID, notification);
	}
}
