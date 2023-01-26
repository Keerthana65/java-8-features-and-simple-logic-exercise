package com.java.eight.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPI {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i < 50; i++) {
			total += i;
		}
		System.out.println("Before Java8 :" + total);

		int total1 = IntStream.rangeClosed(0, 50).sum();
		System.out.println("In Java8 :" + total1);

		/*
		 * Before Java 8 - Remove duplicate records in the array list
		 */
		List<String> names = Arrays.asList("Sam", "John", "Sam", "Keith");
		List<String> uniqueList = new ArrayList<String>();
		for (String name : names) {
			if (!uniqueList.contains(name)) {
				uniqueList.add(name);
			}
		}
		System.out.println("Before Java 8 : " + uniqueList);

		/*
		 * In Java 8
		 */
		List<String> uniqueList1 = names.stream().distinct().collect(Collectors.toList());
		System.out.println("In Java 8 : " + uniqueList1);
	}
}
