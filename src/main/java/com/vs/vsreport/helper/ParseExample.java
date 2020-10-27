package com.vs.vsreport.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ParseExample {

	public static void main(String... args) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy HH.mm.ss.SSS", Locale.ENGLISH);
		 
		String dateInString = "31-Oct-20 12.00.00.000000000 AM";
		Date date = formatter.parse(dateInString);
		System.out.println("date ==>> "+date);
	}
}
