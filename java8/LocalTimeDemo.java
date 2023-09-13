package com.java8;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LocalTime t1= LocalTime.now();
       System.out.println(t1);
       int minut= t1.getMinute();
       int hour= t1.getHour();
       int second= t1.getSecond();
       int nanoSecond= t1.getNano();
       System.out.println(hour);
       System.out.println(minut);
       System.out.printf("%d:%d: %d", hour,minut,second);
	}

}
