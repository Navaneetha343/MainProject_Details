package com.java8;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateDemo1 {
 public static void main(String[] args) throws ParseException {
	 Date d1= new Date();
		/*
		 * System.out.println(d1); //Converting date obj formmat to string object format
		 */	 SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/YYYY");
	 String changedData= sdf.format(d1);
	 System.out.println(changedData);
	 //converting string to Date
	 SimpleDateFormat sdf1= new SimpleDateFormat("YYYY-MM-dd");
	 Date conversion = sdf1.parse("2023-08-26");
	 System.out.println(conversion);
	 
 
 }
}
