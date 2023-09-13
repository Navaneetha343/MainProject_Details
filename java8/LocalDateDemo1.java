package com.java8;

import java.time.LocalDate;

public class LocalDateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		int Month = currentDate.getMonthValue();
		int presentDate = currentDate.getDayOfMonth();
		int year= currentDate.getYear();
		System.out.println("Current month " + Month);
		System.out.println("Current date " + presentDate);
		System.out.println("Current year " + year);


	}

}	
