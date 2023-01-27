package com.java.eight.features.repo;

import java.util.List;
import java.util.function.Predicate;

public class PredicatePerson {
	static Predicate<Person> age = per -> per.getAge() > 25;
	static Predicate<Person> address = per -> per.getAddress().equals("PPT");

	public static void main(String[] args) {
		List<Person> liPersons = PersonRepo.getAllPersons();
		liPersons.forEach(per -> {
			if (age.and(address).test(per)) {
				System.out.println(per);
			}
		});
	}
}
