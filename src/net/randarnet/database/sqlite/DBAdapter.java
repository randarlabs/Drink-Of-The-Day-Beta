package net.randarnet.database.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
//import java.util.Random;

public class DBAdapter
{
    public static final String KEY_ROWID = "_id";
    public static final String KEY_DRINK = "drink";
    public static final String KEY_RECIPE = "recipe";    
    private static final String TAG = "DBAdapter";
    
    private static final String DATABASE_NAME = "drinks";
    private static final String DATABASE_TABLE = "recipes";
    private static int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE =
        "create table recipes (_id integer primary key autoincrement, "
        + "drink text not null, recipe text not null);";
        
    private final Context context; 
    
    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;

    public DBAdapter(Context ctx) 
    {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }
        
    private static class DatabaseHelper extends SQLiteOpenHelper 
    {
        DatabaseHelper(Context context) 
        {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) 
        {
            db.execSQL(DATABASE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, 
        int newVersion) 
        {
            Log.w(TAG, "Upgrading database from version " + oldVersion 
                    + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS recipes");
            onCreate(db);
        }
    }
    public void upDateVersion(){
    	++DATABASE_VERSION;
    }
    //---opens the database---
    public DBAdapter open() throws SQLException 
    {
        db = DBHelper.getWritableDatabase();
        return this;
    }

    //---closes the database---    
    public void close() 
    {
        DBHelper.close();
    }
    
    //---insert a recipe into the database---
    public long insertRecipe(String drink, String recipe) 
    {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_DRINK, drink);
        initialValues.put(KEY_RECIPE, recipe);
        return db.insert(DATABASE_TABLE, null, initialValues);
    }

    //---deletes a particular recipe---
    public boolean deleteRecipe(long rowId) 
    {
        return db.delete(DATABASE_TABLE, KEY_ROWID + 
        		"=" + rowId, null) > 0;
    }

    //---retrieves all the recipes---
    public Cursor getAllRecipes() 
    {
        return db.query(DATABASE_TABLE, new String[] {
        		KEY_ROWID, 
        		KEY_DRINK,
        		KEY_RECIPE,}, 
                null, 
                null, 
                null, 
                null, 
                null);
    }
    //---retrieves a random recipe---
  /*  public String getRandomEntry()
    {
    	Cursor id = getAllRecipes();
    	Random random = new Random();
    	int rand = random.nextInt(getAllRecipes());
    	if(rand == 0)
    		++rand;
    	Cursor cursor = db.rawQuery("HELP" + rand, null);
    	if(cursor.moveToFirst()){
    		return cursor.getString(0);
    	}
    	return cursor.getString(0);
    }*/
    //---retrieves a particular recipe---
    public Cursor getRecipe(long rowId) throws SQLException 
    {
        Cursor mCursor =
                db.query(true, DATABASE_TABLE, new String[] {
                		KEY_ROWID,
                		KEY_DRINK, 
                		KEY_RECIPE,
                		}, 
                		KEY_ROWID + "=" + rowId, 
                		null,
                		null, 
                		null, 
                		null, 
                		null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    //---updates a recipe---
    public boolean updateRecipe(long rowId, String drink, 
    String recipe) 
    {
        ContentValues args = new ContentValues();
        args.put(KEY_DRINK, drink);
        args.put(KEY_RECIPE, recipe);
        return db.update(DATABASE_TABLE, args, 
                         KEY_ROWID + "=" + rowId, null) > 0;
    }
    public String DisplayRecipe(Cursor c){
    	String temp = c.getString(1) + c.getString(2);
    	c.close();
    	return temp;
    }
}
