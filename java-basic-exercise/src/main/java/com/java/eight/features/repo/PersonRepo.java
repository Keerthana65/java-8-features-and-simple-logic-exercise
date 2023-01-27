package com.java.eight.features.repo;

import java.util.Arrays;
import java.util.List;

public class PersonRepo {
	public static List<Person> getAllPersons() {
		Person p1 = new Person("Keerthi", "Ravi", 26, "PPT");
		Person p2 = new Person("Lavan", "Ravi", 25, "PPT");
		Person p3 = new Person("Romi", "Praveen", 28, "Jaffna");
		return Arrays.asList(p1, p2, p3);
	}
}
