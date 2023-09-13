package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo1 {

	public static void main(String[] args) {
		
		
		Person1 p1=new Person1(22, "Navaneetha", 30000.00);
		Person1 p2=new Person1(25, "Ammu", 30070.00);
		Person1 p3=new Person1(22, "Nava", 30006.00);
		Person1 p4=new Person1(26, "Navaneetha", 30000.00);
		
		List<Person1> personsList= Arrays.asList(p1,p2,p3,p4);
		List<String> names= personsList.stream().filter(p->p.name.equals("Navaneetha")).map(q->q.name).collect(Collectors.toList());

	}}


