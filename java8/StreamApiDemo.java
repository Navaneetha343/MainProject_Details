package com.java8;
import java.util.*;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        List<Integer> demo = new ArrayList<>();
                 demo.add(30);
                 demo.add(13);
                 demo.add(15);
                 demo.add(20);
   // Stream<Integer> strdemo= demo.stream() ;
  // Stream <Integer> fltrdemo=  strdemo.filter(i->i>10);
    demo.stream().sorted().forEach(i->System.out.println(i));    
	
	}

}
