package com.java.eight.features;

import java.util.Comparator;
import java.util.function.Function;

public class LambdaExpression {
	public static int compareNumbers(int a, int b) {
		return Integer.compare(a, b);
	}

	public static void main(String[] args) {
		int comp = LambdaExpression.compareNumbers(20, 10);
		System.out.println("Comp :" + comp);
		
		Comparator<Integer> comp1 = (x, y) -> compareNumbers(x, y);
		System.out.println("Compare with Lambdas :" + comp1.compare(20, 10));
		
		Comparator<Integer> comp2 = LambdaExpression::compareNumbers;
		System.out.println("Compare with Method Reference :" + comp2.compare(20, 10));

		/*
		 * String
		 */
		Function<String, String> fun1 = s -> s.toUpperCase();
		String str = fun1.apply("Java8");
		System.out.println(str);
		
		Function<String, String> fun2 = String::toUpperCase;
		String str1 = fun2.apply("Java8");
		System.out.println(str1);
	}
}
