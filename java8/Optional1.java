package com.java8;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Customer cr = new Customer(11, "navaneetha", "ellitamnavaneetha@gmail.com");
      String emailId= Customer.getEmail();
       //System.out.println(emailId);
      // Optional<String> opt  = Optional.of(Customer.getEmail());
      Optional<String> opt= Optional.ofNullable(Customer.getEmail());
      
      // System.out.println(opt.orElseGet(() ->" No data found"));
      System.out.println(opt.map (String:: toUpperCase));
	}

}
