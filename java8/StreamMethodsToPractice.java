package com.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethodsToPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.converting int[] arrays to stream
		int[] number= {1,3,2,4,6,9,7,8};
		     Arrays.stream(number).boxed().findFirst().get();
		     // doubt case
		    
		    System.out.println("-------------------------------------------------------");

		//2. print integers using integers stream
		IntStream.range(0, 20).forEach(i->System.out.println(i));
		//Stream<Integer> number = Stream.of(1,2,3,4,5);
		//((Object) number).stream().forEach(i->System.outprintln(i));
		
		    System.out.println("-------------------------------------------------------");
		    //3. intStream with skip and sum
		    int sum = IntStream.range(1, 11).skip(3).sum();
		    System.out.println(sum);
		    System.out.println("-------------------------------------------------------");
		    //4. stream.of sorted and findfirst()
		  Optional<String> name =  Stream.of("Navaneetha","Ammu","Nava").sorted().findFirst();
		  if(name.isPresent()) {
			  System.out.println(name.get());  
		  }
		    System.out.println("-------------------------------------------------------");
          //5. take string of array and filter it and print
		    String[] filteredName = {"Navaneetha","Akanksha","Laxmi","Ajay"};
		    Arrays.stream(filteredName).filter(i->i.startsWith("A")).forEach(i->System.out.println(i));
		    
		    System.out.println("-------------------------------------------------------");

		    //6. avg of squares of int in stream
		  Arrays.stream(new int[] {2,3,4,5,6}).map(i->i*i).average().ifPresent(System.out::println);  
		    System.out.println("-------------------------------------------------------");
			  Arrays.stream(new int[] {2,3,4,5,6}).map(i->i*i).forEach(j->System.out.println(j));  
			  System.out.println("-------------------------------------------------------");
			  //7.stream from the list , print and filter,map
			  List<String> list1= Arrays.asList("Navaneetha","Akanksha","Laxmi","Ajay");
              list1.stream().map(String::toUpperCase).sorted().filter(i->i.startsWith("A")).forEach(i->System.out.println(i));
			  System.out.println("-------------------------------------------------------");

              //8. stream rows from text file sort and filter
              Stream<String> f1= Files.lines(Paths.get("file12.txt"));
              f1.filter(i->i.startsWith("N")).forEach(System.out::println);
              f1.close();
			  System.out.println("-------------------------------------------------------");
        //9. Stream rows from the text file and save it to the list
			  Stream<String> f2= Files.lines(Paths.get("file12.txt"));
					List<String> f3=  f2.sorted().collect(Collectors.toList());
					System.out.println(f3);
					f2.close();
					//10. counting
					long f4 = Files.lines(Paths.get("file13.txt")).map(i->i.split(",")).filter(i->i.length>=3).count();
					System.out.println(f4);
		              //11. IntSummeryStatastics
		    
					//IntSummeryStatastics sumVallues = IntStream.of(22,3,4,6,77,8);
					//12. use reduse
					Integer reduced= Stream.of(7,1,4).reduce(1,(Integer a, Integer b)->a*b);
		           System.out.println(reduced);
		    
        		  
		
	}

}
