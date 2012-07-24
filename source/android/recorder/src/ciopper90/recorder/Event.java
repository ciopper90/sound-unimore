package ciopper90.recorder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Event {
	private String evento;
	private String inizio,fine;
	private String perc;
	private int campioni;


	public Event(String evento, String inizio,String perc) {
		super();
		this.evento = evento;
		this.inizio = inizio;
		SimpleDateFormat df = new SimpleDateFormat("HH:mm");
		Date d = null;
		try {
			d = df.parse(inizio);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Calendar gc = new GregorianCalendar();
		gc.setTime(d);
		gc.add(Calendar.MINUTE, 1);
		d = gc.getTime();

		if(d.getMinutes()<=9)
			this.fine = d.getHours()+":0"+d.getMinutes();
		else
			this.fine = d.getHours()+":"+d.getMinutes();
		this.perc=perc;
		this.campioni=18;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getInizio() {
		return inizio;
	}

	public void setInizio(String inizio) {
		this.inizio = inizio;
	}

	public String getFine() {
		return fine;
	}

	public void setFine(String fine) {
		this.fine = fine;
	}

	public String getPerc() {
		if(perc.length()>=6){
			return (String) perc.subSequence(0, 6);
		}
		return perc;

	}

	public void setPerc(double d) {
		this.perc = String.valueOf(d);
	}

	public int getCampioni() {
		return campioni;
	}

	public void setCampioni(int campioni) {
		this.campioni = campioni;
	}






}
