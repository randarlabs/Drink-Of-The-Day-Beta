package com.randarlabs;

import com.randarlabs.database.sqlite.DBAdapter;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;

public class Constructor extends Activity {
    private final static String error = "ERROR";
    DBAdapter database;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(com.randarlabs.android.R.layout.main);
      /*  FindDate.setDate();
        ThemeOfTheDay.setTheme();
        if(database == null)
        	database = new DBAdapter(this);
        else
        	database.upDateVersion();
        DatabasePicker.setDrinkDatabase(database);
        //TextView tv = new TextView(this);
        TextView tv = (TextView)findViewById(com.randarlabs.android.R.id.TV_drink);
        tv.setText("\nTheme of the day: " + ThemeOfTheDay.getTheme() +
        		"\nDrink of the day: " + getDrinkName(1, database) +
        		"\n" + getDrinkRecipe(1, database) +
        		"\n" + getDrinkDirections(1, database));
        database.close();
        /*********************************
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
    	if(prefs.getBoolean("firstTime", false)) {
    		BetaAlertDialog.displayDialog();
    	}
    	SharedPreferences.Editor editor = prefs.edit();
    	editor.putBoolean("firstTime", true);
    	editor.commit();
		/**********************************/
    }
   
    public void onStop(){
    	super.onStop();
    	finish();
    }
    public void onDestory(){
    	super.onDestroy();
    	return;
    }
    /****************************************************/
    public static String getDrinkName(long db_id, DBAdapter db){
    	db.open();
        Cursor c = db.getRecipe(db_id);
        if (c.moveToFirst()){        
            String temp = db.DisplayDrinkName(c);
            c.close();
            db.close();
            return temp;
        }
        else {
        	c.close();
        	db.close();
           // Toast.makeText(, "ERROR: No recipe found", Toast.LENGTH_LONG).show();
            return error;
        }
    }
    public static String getDrinkRecipe(long db_id, DBAdapter db){
    	db.open();
        Cursor c = db.getRecipe(db_id);
        if (c.moveToFirst()){        
            String temp = db.DisplayDrinkRecipe(c);
            c.close();
            db.close();
            return temp;
        }
        else {
        	c.close();
        	db.close();
           // Toast.makeText(, "ERROR: No recipe found", Toast.LENGTH_LONG).show();
            return error;
        }
    }
    public static String getDrinkDirections(long db_id, DBAdapter db){
    	db.open();
        Cursor c = db.getRecipe(db_id);
        if (c.moveToFirst()){        
            String temp = db.DisplayDrinkDirections(c);
            c.close();
            db.close();
            return temp;
        }
        else {
        	c.close();
        	db.close();
           // Toast.makeText(, "ERROR: No recipe found", Toast.LENGTH_LONG).show();
            return error;
        }
    }
}
//ICONS:
//Author:	deleket
//Website:	http://deleket.deviantart.com/