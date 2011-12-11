package com.randarlabs.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.randarlabs.text.*;

public class FindDate {
	public static void setDate() {
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(DateFormat.DATE_FORMAT);
		date = sdf.format(d1);
	}
	public static String getDate() {
		return date;
	}
	private static String date;
}
