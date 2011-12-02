package net.randarnet.database;

import net.randarnet.database.sqlite.DBAdapter;

public class Drinks {
	public static void setSundayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"Rum & Coke\n",
        		"\nIngredients to use:\n" +
        		"5 oz.  Cola\n" +
        		"2 oz.  Light Rum\n" + 
        		"\nDirections:\n" +
        		"Fill a Highball glass almost full with ice cubes. Pour Rum and Coke into the Highball glass. " +
        		"Stir well, garnish with a Lemon Wedge, and serve.");        
        id = db.insertRecipe(
        		"Shirley Temple (non-alcoholic)\n",
        		"\nIngredients:\n" +
        		"3 oz lemon-lime soda\n" +
        		"3 oz ginger ale\n" +
        		"1 dash grenadine\n" +
        		"maraschino cherry for garnish\n" +
        		"\nDirections:\n" +
        		"Pour the lemon-lime soda and ginger ale into a collins glass with ice cubes. " +
        		"Add a dash of grenadine. Stir. Garnish with the cherry.");
        db.close();
	}
	public static void setMondayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"MONDAY TEST DRINK\n",
        		"\nTEST Ingredients:\n" +
        		"5 oz.  DRINK\n" +
        		"2 oz.  DRINK\n" + 
        		"\nTEST Directions:\n" +
        		"STEP 1, " +
        		"and serve.");
		db.close();
	}
	public static void setTuesdayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"TUESDAY TEST DRINK\n",
        		"\nTEST Ingredients:\n" +
        		"5 oz.  DRINK\n" +
        		"2 oz.  DRINK\n" + 
        		"\nTEST Directions:\n" +
        		"STEP 1, " +
        		"and serve.");
		db.close();
	}
	public static void setWednesdayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"WEDNESDAY TEST DRINK\n",
        		"\nTEST Ingredients:\n" +
        		"5 oz.  DRINK\n" +
        		"2 oz.  DRINK\n" + 
        		"\nTEST Directions:\n" +
        		"STEP 1, " +
        		"and serve.");
		db.close();
	}
	public static void setThursdayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"THURSDAY TEST DRINK\n",
        		"\nTEST Ingredients:\n" +
        		"5 oz.  DRINK\n" +
        		"2 oz.  DRINK\n" + 
        		"\nTEST Directions:\n" +
        		"STEP 1, " +
        		"and serve.");
		db.close();
	}
	public static void setFridayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"FRIDAY TEST DRINK\n",
        		"\nTEST Ingredients:\n" +
        		"5 oz.  DRINK\n" +
        		"2 oz.  DRINK\n" + 
        		"\nTEST Directions:\n" +
        		"STEP 1, " +
        		"and serve.");
		db.close();
	}
	public static void setSaturdayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"SATURDAY TEST DRINK\n",
        		"\nTEST Ingredients:\n" +
        		"5 oz.  DRINK\n" +
        		"2 oz.  DRINK\n" + 
        		"\nTEST Directions:\n" +
        		"STEP 1, " +
        		"and serve.");
		db.close();
	}
	@SuppressWarnings("unused")
	private static long id;
}
