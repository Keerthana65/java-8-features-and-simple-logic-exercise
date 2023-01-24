package com.java.basic.exercise;

public class Excercise5 {

	static void visitorsCount(String[] arr, int len) {
		String letter;
		int i;
		int count1 = 0, count2 = 0, count3 = 0;

		for (i = 0; i < len; i++) {
			letter = arr[i];
			if (letter == "W") {
				count1 = count1 + 1;
			} else if (letter == "M") {
				count2 = count2 + 1;
			} else if (letter == "C") {
				count3 = count3 + 1;
			} else {
				// nothing do
			}
		}
		System.out.println(count1 + " " + count2 + " " + count3);
		if ((count1 > count2) && (count2 > count3) && (count1 > count3)) {
			if ((count1 != 0) && (count2 != 0) && (count3 != 0)) {
				System.out.println(count1 + "W" + count2 + "M" + count3 + "C");
			}
		}

	}

	public static void main(String[] args) {
		String arr[] = { "W", "W", "W", "M", "C", "W", "W", "C", "C", "M" };
		int len = arr.length;
		visitorsCount(arr, len);
	}
}
