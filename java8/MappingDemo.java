package com.java8;

import java.util.Arrays;
import java.util.List;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countryNames = Arrays.asList("Navaneetha","Ammu");
		countryNames.stream().map(name->name.toLowerCase())

	}

}
