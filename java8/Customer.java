package com.java8;

public class Customer {
int id;
String name;
static String emailId;
public Customer(int id, String name, String emailId) {
	this.id=id;
	this.name=name;
	this.emailId=emailId;
}
public static String getEmail() {
	// TODO Auto-generated method stub
	
	return emailId;
}
}
