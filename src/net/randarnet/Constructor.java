package net.randarnet;

import net.randarnet.database.sqlite.DBAdapter;
import net.randarnet.database.sqlite.DatabasePicker;
import net.randarnet.util.FindDate;
import net.randarnet.util.ThemeOfTheDay;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;
import android.widget.Toast;

public class Constructor extends Activity {
    /****************************************************/
	//This sets up all the strings to be passed to the TextView.setText()
	//This is pretty much the poor man's UI
	//REQUIRMENTS: All must be able to be converted to a String
    public void setString(DBAdapter db){
    	s = FindDate.getDate() + 
    	"\nTheme of the day: " + ThemeOfTheDay.getTheme() +
		"\nDrink of the day: " + getRecipe(1, db) +
		"\n\n\nTODO:" +
		"\n1. Build database(s) - 90% Complete" +
		"\n2. Add drinks to database(s)" +
		"\n3. Choose radom drink based on theme of the day" +
		"\n4. Create UI" +
		"\n5. Add AdMob" +
		"\n6. Make a widget";
    }
    /****************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FindDate.setDate();
        ThemeOfTheDay.setTheme();
        /*********************************/
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        	if(prefs.getBoolean("firstTime", false)) {
        		AlertDialog.Builder builder = new AlertDialog.Builder(this);
        		builder.setMessage(BetaAlertDialog.getDialog())
        			.setCancelable(false)
        			.setPositiveButton("Agree", new DialogInterface.OnClickListener() {
        				public void onClick(DialogInterface dialog, int id) {
        					dialog.cancel();
        				}
        			});
        		AlertDialog alert = builder.create();
        		alert.setTitle("Drink of the Day End User License Agreement");
        		alert.show();
        	    SharedPreferences.Editor editor = prefs.edit();
        	    editor.putBoolean("firstTime", true);
        	    editor.commit();
        	}
		/**********************************/
		setContentView(com.randarlabs.android.R.layout.main);
        if(database == null)
        	database = new DBAdapter(this);
        else
        	database.upDateVersion();
        DatabasePicker.setDrinkDatabase(database);
        //TextView tv = new TextView(this);
        TextView tv = (TextView)findViewById(com.randarlabs.android.R.id.TV_drink);
        tv.setText(getString(database));
        
        database.close();
    }
    /****************************************************
    public void onRestart() {
    	super.onRestart();
    	FindDate.setDate();
        ThemeOfTheDay.setTheme();
        //DBAdapter database = new DBAdapter(this);
        
        DatabasePicker.setDrinkDatabase(database);
        TextView tv = new TextView(this);
        tv.setText(getString(database));
        setContentView(tv);
    }
    
    /****************************************************
    public void onResume() {
    	super.onResume();
    	FindDate.setDate();
        ThemeOfTheDay.setTheme();
        //DBAdapter database = new DBAdapter(this);
        DatabasePicker.setDrinkDatabase(database);
        TextView tv = new TextView(this);
        tv.setText(getString(database));
        setContentView(tv);
    }
    /****************************************************
    public void onStart() {
    	super.onStart();
    	FindDate.setDate();
        ThemeOfTheDay.setTheme();  
        //DBAdapter database = new DBAdapter(this);
        DatabasePicker.setDrinkDatabase(database);
        TextView tv = new TextView(this);
        tv.setText(getString(database));
        setContentView(tv);
    }
    /****************************************************/
    public void onStop(){
    	super.onStop();
    	finish();
    }
    public void onDestory(){
    	super.onDestroy();
    	return;
    }
    public String getString(DBAdapter X){
    	setString(X);
    	return s;
    }
    /****************************************************/
    private String s;
    private final String error = "ERROR";
    DBAdapter database;
    /****************************************************/
    public String getRecipe(long db_id, DBAdapter db){
    	db.open();
        Cursor c = db.getRecipe(db_id);
        if (c.moveToFirst()){        
            String temp = db.DisplayRecipe(c);
            c.close();
            db.close();
            return temp;
        }
        else {
        	c.close();
        	db.close();
            Toast.makeText(this, "ERROR: No recipe found", Toast.LENGTH_LONG).show();
            return error;
        }
    }
}
//ICONS:
//Author:	deleket
//Website:	http://deleket.deviantart.com/