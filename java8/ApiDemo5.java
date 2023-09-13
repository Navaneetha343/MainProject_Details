package com.java8;
import java.util.*;
public class ApiDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> number= Arrays.asList(3,4,6,12,20);
	  boolean answer = number.stream().anyMatch(n-> n*(n+1)/4==5);
	  System.out.println(answer);
	
	
	
	}

}
