package com.randarlabs.util;

import java.util.Calendar;

public class ThemeOfTheDay {
	public static void setTheme() {
		FindDay.setDayOfTheWeek();
		switch(FindDay.getDayOfTheWeek()){
		case Calendar.SUNDAY:
			theme = "Sometimes Sunday";
			break;
		case Calendar.MONDAY:
			theme = "Margarita Monday";
			break;
		case Calendar.TUESDAY:
			theme = "Tequila Tuesday";
			break;
		case Calendar.WEDNESDAY:
			theme = "Whiskey Wednesday";
			break;
		case Calendar.THURSDAY:
			theme = "Thirsty Thursday";
			break;
		case Calendar.FRIDAY:
			theme = "Fucked-Up Friday";
			break;
		case Calendar.SATURDAY:
			theme = "Shit-Faced Saturday";
			break;
		default:
			theme = "ERROR: Please email me";
			break;
		}
	}
	public static String getTheme(){
		return theme;
	}
	private static String theme;
}
