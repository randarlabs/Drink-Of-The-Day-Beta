package com.randarlabs.util;

import java.util.Calendar;

public class FindDay {
	public static void setDayOfTheWeek(){
		Calendar cal = Calendar.getInstance();
		day = cal.get(Calendar.DAY_OF_WEEK);
	}
	public static int getDayOfTheWeek(){
		return day;
	}
	private static int day;
}
