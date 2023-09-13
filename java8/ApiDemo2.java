package com.java8;

import java.util.*;
import java.util.stream.Stream;

public class ApiDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> names = Stream.of("Navaneetha", "Akanksha", "Laxmi priya", "Ajay");
		  names.filter(i->i.startsWith(i, 'A')).forEach(i->System.out.println(i));
		 

	}

}
