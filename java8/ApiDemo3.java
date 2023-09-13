
package com.java8;
import java.util.*;

public class ApiDemo3 {

	public static void main(String[] args) {
		List< Integer> str= Arrays.asList(12,15,10,30);
		   str.stream().filter(i->i>10 & i<15).forEach(i->System.out.println(i));
		   str.stream().forEachOrdered(i->System.out.println(i));
		   
		   System.out.println(str.stream().getClass());
		  // System.out.println(str[2].stream().hashcode());

	
	
	
	
	}
	
}

