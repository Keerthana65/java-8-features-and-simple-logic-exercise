package com.java.eight.features.repo;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerPerson {
	static List<Person> listPersons = PersonRepo.getAllPersons();
	static BiConsumer<String, Integer> personAge = (name, age) -> {
		System.out.println("Name : " + name + " && Age : " + age);
	};

	static void fetchPersonAge() {
		listPersons.forEach(per -> {
			personAge.accept(per.getFirstName(), per.getAge());
		});
	}

	public static void main(String[] args) {
		fetchPersonAge();
	}
}
