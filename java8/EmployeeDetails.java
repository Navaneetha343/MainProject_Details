package com.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class EmployeeDetails {

	public static void main(String[] args) {
		List<Employee> employeelist = new ArrayList<>();

		employeelist.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeelist.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeelist.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeelist.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeelist.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeelist.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeelist.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeelist.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));                        
		employeelist.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeelist.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeelist.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeelist.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeelist.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeelist.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeelist.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeelist.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeelist.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

//1. what is the avg salary of male and female employee?
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
				employeelist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
				         
				System.out.println( " The avg salary of Male and Female employyes are " +avgSalaryOfMaleAndFemaleEmployees);
				System.out.println("---------------------------------------------------------------------");

//2. list down the name of all employees in each department?
//employeelist.stream().collect(Collectors.groupingBy(i->System.out.println(i.name));
				
			
						         
				System.out.println("---------------------------------------------------------------------");

//3. what is avg salary and total salary of organization?

		DoubleSummaryStatistics avgsalary = employeelist.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.print("The avg salary is " + avgsalary.getAverage());System.out.println("  and The total salary is " + avgsalary.getSum());
		System.out.println("---------------------------------------------------------------------");
// 4. Who is the oldest employee in the organization?
		Optional<Employee> oldestPerson= employeelist.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		System.out.println( " The oldest person is " +oldestPerson.get().name);
		System.out.println("---------------------------------------------------------------------");
		
//5. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		
		//employeelist.stream().filter(i->i.age<=25).forEach(i->System.out.println(i.name));

		//Map<String, List<Employee>> names= employeelist.stream().filter(i->i.age>25).collect(Collectors.groupingBy(Employee::getName));
		System.out.println("---------------------------------------------------------------------");
// 6. second highest salary person detais
		Optional<Employee> empDetais = employeelist.stream()
		        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println(empDetais);
		System.out.println("---------------------------------------------------------------------");

		//7.How many male and female employees are there
		Map<String,Long> count =employeelist.stream().collect(Collectors.groupingBy((Employee::getGender), Collectors.counting()));
		System.out.println(count);
		System.out.println("---------------------------------------------------------------------");
		//9.all the deparmwnts in the organisation
		List<String> departs = employeelist.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println(departs);
		//10. avg age of male and female employees  in the organisation
		Map<String,Long> avgAge = employeelist.stream().map(Employee::getGender).collect( Collectors.averagingDouble(Employee::getAge));

       
	}
}