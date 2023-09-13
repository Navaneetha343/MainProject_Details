package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntArrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, -5, 3, 14, -2, 17 };
		int secondLargestNumber = Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println(" the second largest number is " + secondLargestNumber);

		int secondLowestNumber = Arrays.stream(arr1).boxed().sorted().skip(1).findFirst().get();
		System.out.println(" the second minimum number is " + secondLowestNumber);
		int sum = (secondLargestNumber + secondLowestNumber);
		System.out.println(sum);
	}
}
