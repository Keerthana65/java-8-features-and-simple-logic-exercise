package com.java.eight.features.repo;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPersonExample {
	static Consumer<Person> con = (person) -> System.out.println(person);
	static Consumer<Person> con1 = (person) -> System.out.println(person.getLastName().toUpperCase());
	static List<Person> listPersons = PersonRepo.getAllPersons();

	static void printWithCondition() {
		listPersons.forEach(person -> {
			if (person.getAge() > 25) {
				con.andThen(con1).accept(person);
			}
		});
	}

	public static void main(String[] args) {
		printWithCondition();
	}
}
