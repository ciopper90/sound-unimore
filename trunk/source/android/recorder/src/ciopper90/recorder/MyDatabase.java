package ciopper90.recorder;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase {  

	SQLiteDatabase mDb;
	DbHelper mDbHelper;
	Context mContext;
	private static final String DB_NAME="testapp";//nome del db
	private static final int DB_VERSION=1; //numero di versione del nostro db

	public MyDatabase(Context ctx){
		mContext=ctx;
		mDbHelper=new DbHelper(ctx, DB_NAME, null, DB_VERSION);   //quando istanziamo questa classe, istanziamo anche l'helper (vedi sotto)    
	}

	public void open(){  //il database su cui agiamo è leggibile/scrivibile
		mDb=mDbHelper.getWritableDatabase();

	}

	public void close(){ //chiudiamo il database su cui agiamo
		mDb.close();
	}


	//i seguenti 2 metodi servono per la lettura/scrittura del db. aggiungete e modificate a discrezione
	// consiglio:si potrebbe creare una classe Prodotto, i quali oggetti verrebbero passati come parametri dei seguenti metodi, rispettivamente ritornati. Lacio a voi il divertimento


	public void insertSample(String name,double zcr,double lefr,double sc,double entropy,int number,int number_sample,String date,String hour){ //metodo per inserire i dati
		ContentValues cv=new ContentValues();
		cv.put(ProductsMetaData.PRODUCT_NAME_KEY, name);
		cv.put(ProductsMetaData.PRODUCT_NAME_ZCR, zcr);
		cv.put(ProductsMetaData.PRODUCT_NAME_LEFR, lefr);
		cv.put(ProductsMetaData.PRODUCT_NAME_SC, sc);
		cv.put(ProductsMetaData.PRODUCT_NAME_ENTROPY, entropy);
		cv.put(ProductsMetaData.PRODUCT_NAME_NUMB, number);
		cv.put(ProductsMetaData.PRODUCT_NAME_SAMPLE, number_sample);
		cv.put(ProductsMetaData.PRODUCT_NAME_DATE, date);
		cv.put(ProductsMetaData.PRODUCT_NAME_HOUR, hour);
		mDb.insert(ProductsMetaData.TABLE_PRODUCTS, null, cv);
	}
	
	public void insertEvent(String name,int number,double perc,String hour){ //metodo per inserire i dati
		ContentValues cv=new ContentValues();
		cv.put(ProductsMetaData.PRODUCT_NAME_KEY, name);
		cv.put(ProductsMetaData.PRODUCT_NAME_NUMB, number);
		cv.put(ProductsMetaData.PRODUCT_NAME_PERC, perc);
		cv.put(ProductsMetaData.PRODUCT_NAME_HOUR, hour);
		mDb.insert(ProductsMetaData.TABLE_EVENT, null, cv);
	}

	public Cursor fetchEvents(){ //metodo per fare la query di tutti i dati
		return mDb.query(ProductsMetaData.TABLE_EVENT, null,null,null,null,null,"fragment desc");                            
	}

	static class ProductsMetaData {  // i metadati della tabella, accessibili ovunque
		static final String TABLE_PRODUCTS = "classify";
		static final String TABLE_EVENT = "event";
		static final String ID = "_id";
		static final String PRODUCT_NAME_KEY = "type";
		static final String PRODUCT_NAME_ZCR = "zcr";
		static final String PRODUCT_NAME_LEFR = "lfer";
		static final String PRODUCT_NAME_SC = "sc";
		static final String PRODUCT_NAME_ENTROPY = "entropy";
		static final String PRODUCT_NAME_NUMB = "fragment";
		static final String PRODUCT_NAME_DATE = "data";
		static final String PRODUCT_NAME_HOUR = "hour";
		static final String PRODUCT_NAME_SAMPLE = "number_sample";
		static final String PRODUCT_NAME_PERC = "percentuale";
	}

	private static final String TABLE_PRODUCTS_CREATE = "CREATE TABLE IF NOT EXISTS "  //codice sql di creazione della tabella
			+ ProductsMetaData.TABLE_PRODUCTS + " ("
			+ ProductsMetaData.ID+ " integer primary key autoincrement, "
			+ ProductsMetaData.PRODUCT_NAME_KEY + " text not null, "
			+ ProductsMetaData.PRODUCT_NAME_ZCR + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_LEFR + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_SC + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_ENTROPY + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_NUMB + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_DATE + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_HOUR + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_SAMPLE + " integer not null);";

	private static final String TABLE_EVENT_CREATE = "CREATE TABLE IF NOT EXISTS "  //codice sql di creazione della tabella
			+ ProductsMetaData.TABLE_EVENT + " ("
			+ ProductsMetaData.ID+ " integer primary key autoincrement, "
			+ ProductsMetaData.PRODUCT_NAME_KEY + " text not null, "
			+ ProductsMetaData.PRODUCT_NAME_NUMB + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_PERC + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_HOUR + " not null);";

	private class DbHelper extends SQLiteOpenHelper { //classe che ci aiuta nella creazione del db

		public DbHelper(Context context, String name, CursorFactory factory,int version) {
			super(context, name, factory, version);
		}

		@Override
		public void onCreate(SQLiteDatabase _db) { //solo quando il db viene creato, creiamo la tabella
			_db.execSQL(TABLE_PRODUCTS_CREATE);
			_db.execSQL(TABLE_EVENT_CREATE);
		}

		@Override
		public void onUpgrade(SQLiteDatabase _db, int oldVersion, int newVersion) {
			//qui mettiamo eventuali modifiche al db, se nella nostra nuova versione della app, il db cambia numero di versione

		}

	}


}