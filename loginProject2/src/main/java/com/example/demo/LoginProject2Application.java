package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LoginProject2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(LoginProject2Application.class, args);
		String userName= "Navaneetha";
		String password= "aroo@343";
		System.out.println(context.getClass().getName());
	System.out.println(context.getBeanDefinitionCount());
		
	}

}
