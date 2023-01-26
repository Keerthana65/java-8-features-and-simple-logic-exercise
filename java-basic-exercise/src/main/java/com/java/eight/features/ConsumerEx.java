package com.java.eight.features;

import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String[] args) {
		/*
		 * accept method
		 */
		Consumer<String> con = (s) -> System.out.println(s.toUpperCase());
		con.accept("hello keerthi");
		Consumer<String> con1 = (s) -> System.out.println(s.toLowerCase());
		con1.accept("hello keerthi");

		/*
		 * andThen method
		 * this method we can used only same data type consumer
		 */
		con.andThen(con1).accept("Welcome consumer method");

	}
}
