package com.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class CollectorsDemo2 {

	public static void main(String[] args) {
		Person1 p1=new Person1(22, "Navaneetha", 30000.00);
		Person1 p2=new Person1(25, "Ammu", 30070.00);
		Person1 p3=new Person1(22, "Nava", 30006.00);
		Person1 p4=new Person1(26, "Navaneetha", 30000.00);
		List<Person1> name1= Arrays.asList(p1,p2,p3,p4);
		//List<Double> matchedSalaries= name1.stream().filter(p->p.name.equals("Navaneetha")).map(q->q.salary).collect(Collectors.toList());
		//System.out.println(matchedSalaries);
	
	//Optional<Person1> maximumSalary= name1.stream().collect(Collectors.maxBy(Comparator.comparing(s->s.salary)));	
	//System.out.println(maximumSalary);
		//Optional<Person1> minimumSalary = name1.stream().collect(Collectors.minBy(Comparator.comparing(a->a.salary))); 
	Double  avgSalary= name1.stream().collect(Collectors.averagingDouble(a->a.salary));
	System.out.println(avgSalary);
	
	//if(avgSalary.isPresent()) {
		//System.out.println(avgSalary.get().name);
	//}
		
	}

}
