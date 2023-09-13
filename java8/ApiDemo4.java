package com.java8;

import java.util.stream.Stream;

public class ApiDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stream.iterate(1,number->number+1).filter(number->number%5==0).limit(5).forEach(number->System.out.println(number));
     
	
	
	}

}
