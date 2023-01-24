package com.java.eight.features;

import java.util.Optional;

public class OptionalDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Old version
		 */
		String strOld = null;
		System.out.println("The given input string is :" + strOld);
		// try to convert lowercase
		if (strOld != null) {
			System.out.println(strOld.toLowerCase());
		} else {
			System.out.println("String is null");
		}

		/*
		 * New version
		 */

		Optional<String> str = Optional.ofNullable(null);
		str.ifPresent(ls -> System.out.println(ls.toLowerCase()));
	}
}
