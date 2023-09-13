package com.example1.FirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Billcollector bc= context.getBean("bc",Billcollector.class);
		bc.bill();
		
	}

}
