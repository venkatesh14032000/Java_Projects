package com.inter;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Date_Specific_Format {

	public static void main(String[] args) throws ParseException {
		String pattern="D/MM/YYYY";
		SimpleDateFormat sdf= new SimpleDateFormat(pattern);
		String date= sdf.format(new Date());
		System.out.println(date);
		
		// TODO Auto-generated method stub

	}

}
