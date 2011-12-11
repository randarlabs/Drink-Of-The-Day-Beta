package com.randarlabs.database;

import com.randarlabs.database.sqlite.DBAdapter;

public class Drinks {
	public static void setSundayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"Rum & Coke\n",
        		"\nIngredients to use:\n" +
        		"5 oz.  Cola\n" +
        		"2 oz.  Light Rum\n", 
        		"\nDirections:\n" +
        		"Fill a Highball glass almost full with ice cubes. Pour Rum and Coke into the Highball glass. " +
        		"Stir well, garnish with a Lemon Wedge, and serve.");        
        id = db.insertRecipe(
        		"Shirley Temple (non-alcoholic)\n",
        		"\nIngredients:\n" +
        		"3 oz lemon-lime soda\n" +
        		"3 oz ginger ale\n" +
        		"1 dash grenadine\n" +
        		"maraschino cherry for garnish\n",
        		"\nDirections:\n" +
        		"Pour the lemon-lime soda and ginger ale into a collins glass with ice cubes. " +
        		"Add a dash of grenadine. Stir. Garnish with the cherry.");
        db.close();
	}
	public static void setMondayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"Albuquerque Style Margarita",
        		"1 Lime\n6oz Can Frozen Lime Juice or Margarita Mix\n3/4Cup Tequila\n6Tbsp Triple Sec\n" +
        		"1 Can Lemon-Lime or Grapefruit Soda\n4Cups Ice Cubes\nLime Twist for Garnish\nLime Peel for Garnish",
        		"Rub rim of each cocktail glass with lime wedge; swirl glass in salt to coat rim. Combine half of " +
        		"each of the remaining ingredients, except garnishes, in blender container; blend until ice is finely " +
        		"chopped and mixture is slushy. Pour into salt-rimmed glasses. Repeat with remaining ingredients. Garnish, if desired.");
		id = db.insertRecipe(
				"Apricot Margarita",
				"1 1/2Cup Fresh Apricots or 16oz Can Juice-Packed, Unpeeled, Halved\n1/2Cup Tequila\n1/4Cup Sugar\n1/4Cup Fresh " +
				"Lime Juice or Margarita Mix\n1/2Cup Apricot Nectar\n3Cups Ice Cubes",
				"Combine apricot halves, tequila, sugar, lime juice and apricot nectar in a blender; cover and blend until " +
				"smooth. With blender running, add ice cubes, blending until slushy. Makes 4 Margaritas.");
		id = db.insertRecipe(
				"Avocado Margarita",
				"6oz Blanco Tequila\n2oz Triple Sec\n6oz Limeade Concentrate or Margarita Mix\n2Cups Ice\n1 Chopped Avocado\n6oz Water",
				"Blend all ingredients in blender until smooth.");
		id = db.insertRecipe(
				"Banana Margarita",
				"6oz Blanco or Silver Tequila\n6oz Limeade Concentrate or Margarita Mix\n4oz Triple Sec\n6Cups Ice\n2 Bananas\n1/4Cup" +
				" Coarse Granulated Sugar",
				"Sugar the rims of your margarita glasses. In a blender, combine all ingredients and blend until smooth. Pour into glasses and serve.");
		id = db.insertRecipe(
				"Beer Margarita",
				"6oz White or Blanco Tequila\n12oz Beer\n6oz Limeade Concentrate or Margarita Mix\nLime Flavored Salt\nIce Cubes",
				"Cover the rim of the glass with the salt.  Pour all ingredients into blender and blend well.");
		id = db.insertRecipe(
				"Blackberry Lime Margarita",
				"2Cups Blackberries\n1/2Cup Lime Juice or Margarita Mix\n3/4Cups White Tequila\n1/4Cups Sugar\n2Cups Ice Cubes",
				"Puree blackberries in a blender. Force puree through a fine sieve into a small bowl and discard solids.  " +
				"In a cocktail shaker, combine 1/2 cup puree and remaining ingredients and shake well");
		db.close();
		
	}
	public static void setTuesdayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"TUESDAY TEST DRINK\n",
        		"\nTEST Ingredients:\n" +
        		"5 oz.  DRINK\n" +
        		"2 oz.  DRINK\n" , 
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
        		"2 oz.  DRINK\n",
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
        		"2 oz.  DRINK\n",
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
        		"2 oz.  DRINK\n", 
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
        		"2 oz.  DRINK\n",
        		"\nTEST Directions:\n" +
        		"STEP 1, " +
        		"and serve.");
		db.close();
	}
	@SuppressWarnings("unused")
	private static long id;
}
