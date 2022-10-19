package com.coder.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static Date stringToDate(String date)
	{
		Date formatDate=null;
		try {
			formatDate = new SimpleDateFormat("dd/mm/yyy").parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
		return formatDate;
	}
	public static Date stringToTime(String date)
	{
		Date formatDate=null;
		try {
			formatDate = new SimpleDateFormat("hh:mm:ss").parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
		return formatDate;
	}
}
