package net.randarnet.database.sqlite;

import java.util.Calendar;

import android.widget.Toast;
import net.randarnet.util.FindDay;
import net.randarnet.database.Drinks;

public class DatabasePicker {
	public static void setDrinkDatabase(DBAdapter db) {
		FindDay.setDayOfTheWeek();
		switch(FindDay.getDayOfTheWeek()){
		case Calendar.SUNDAY:
			Drinks.setSundayDrinks(db);
			break;
		case Calendar.MONDAY:
			Drinks.setMondayDrinks(db);
			break;
		case Calendar.TUESDAY:
			Drinks.setTuesdayDrinks(db);
			break;
		case Calendar.WEDNESDAY:
			Drinks.setWednesdayDrinks(db);
			break;
		case Calendar.THURSDAY:
			Drinks.setThursdayDrinks(db);
			break;
		case Calendar.FRIDAY:
			Drinks.setFridayDrinks(db);
			break;
		case Calendar.SATURDAY:
			Drinks.setSaturdayDrinks(db);
			break;
		default:
			Toast.makeText(null, "ERROR: Could not load drinks", Toast.LENGTH_LONG).show();
			break;
		}
	}
}
