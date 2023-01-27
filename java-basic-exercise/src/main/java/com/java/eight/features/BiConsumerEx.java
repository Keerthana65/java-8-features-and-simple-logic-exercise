package com.java.eight.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerEx {
	public static void main(String[] args) {
		/*
		 * Simple example for BiConsumer
		 */
		BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("Total : " + (x + y));
		BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println("Balance : " + (x - y));
		biConsumer.accept(20, 10);
		biConsumer1.accept(30, 10);
		biConsumer1.andThen(biConsumer).accept(50, 20);

		/*
		 * Check the 2 array list size is same or not
		 */
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> l2 = Arrays.asList(8, 7, 6, 4, 5);
		BiConsumer<List<Integer>, List<Integer>> check = (list1, list2) -> {
			if (list1.size() == list2.size()) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		};
		check.accept(l1, l2);
	}
}
