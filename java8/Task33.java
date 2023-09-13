package com.java8;

import java.util.Arrays;
import java.util.Comparator;

public class Task33 {
	
		public static void main(String[] args){
		 
		  int[] arr1= {1,-5,3,14,-2,17};
		   
		     int secondLargestNumber = Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		          System.out.println(secondLargestNumber);
		}}

