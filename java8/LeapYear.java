package com.java8;

import java.time.LocalDate;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      boolean leapYear = LocalDate.parse("2023-08-26").isLeapYear();
      System.out.println(leapYear);
	} 

}
