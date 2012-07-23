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


	public void insertProduct(String name,int price,double zcr,double lefr,int number,String d,String h,double sc){ //metodo per inserire i dati
		ContentValues cv=new ContentValues();
		cv.put(ProductsMetaData.PRODUCT_NAME_KEY, name);
		cv.put(ProductsMetaData.PRODUCT_NAME_ZCR, zcr);
		cv.put(ProductsMetaData.PRODUCT_NAME_LEFR, lefr);
		cv.put(ProductsMetaData.PRODUCT_NAME_SC, sc);
		cv.put(ProductsMetaData.PRODUCT_NAME_NUMB, number);
		cv.put(ProductsMetaData.PRODUCT_PRICE_KEY, price);
		cv.put(ProductsMetaData.PRODUCT_NAME_DATE, d);
		cv.put(ProductsMetaData.PRODUCT_NAME_HOUR, h);
		mDb.insert(ProductsMetaData.PRODUCTS_TABLE, null, cv);
	}

	public Cursor fetchProducts(){ //metodo per fare la query di tutti i dati
		return mDb.query(ProductsMetaData.PRODUCTS_TABLE, null,null,null,null,null,null);              
	}

	static class ProductsMetaData {  // i metadati della tabella, accessibili ovunque
		static final String PRODUCTS_TABLE = "classify";
		static final String ID = "_id";
		static final String PRODUCT_NAME_KEY = "type";
		static final String PRODUCT_NAME_ZCR = "zcr";
		static final String PRODUCT_NAME_LEFR = "lfer";
		static final String PRODUCT_NAME_SC = "sc";
		static final String PRODUCT_NAME_NUMB = "fragment";
		static final String PRODUCT_NAME_DATE = "data";
		static final String PRODUCT_NAME_HOUR = "hour";
		static final String PRODUCT_PRICE_KEY = "number";
	}

	private static final String PRODUCTS_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "  //codice sql di creazione della tabella
			+ ProductsMetaData.PRODUCTS_TABLE + " ("
			+ ProductsMetaData.ID+ " integer primary key autoincrement, "
			+ ProductsMetaData.PRODUCT_NAME_KEY + " text not null, "
			+ ProductsMetaData.PRODUCT_NAME_ZCR + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_LEFR + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_SC + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_NUMB + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_DATE + " not null, "
			+ ProductsMetaData.PRODUCT_NAME_HOUR + " not null, "
			+ ProductsMetaData.PRODUCT_PRICE_KEY + " integer not null);";

	private class DbHelper extends SQLiteOpenHelper { //classe che ci aiuta nella creazione del db

		public DbHelper(Context context, String name, CursorFactory factory,int version) {
			super(context, name, factory, version);
		}

		@Override
		public void onCreate(SQLiteDatabase _db) { //solo quando il db viene creato, creiamo la tabella
			_db.execSQL(PRODUCTS_TABLE_CREATE);
		}

		@Override
		public void onUpgrade(SQLiteDatabase _db, int oldVersion, int newVersion) {
			//qui mettiamo eventuali modifiche al db, se nella nostra nuova versione della app, il db cambia numero di versione

		}

	}


}