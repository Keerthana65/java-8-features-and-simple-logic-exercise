package com.java.eight.features;

interface Ridable {
	void ride();

	default void display() {
		System.out.println("Hello from Ridable interface");
	}
}

class Car implements Ridable {
	public void ride() {
		System.out.println("You are riding a car");
	}
}

class Bike implements Ridable {
	public void ride() {
		System.out.println("You are riding a bike");
	}
}

class Mechanic {
	void check(Ridable r) {
		System.out.println("Checking");
		r.ride();
	}
}

public class DefaultMethod {
	public static void main(String[] args) {
		Mechanic m = new Mechanic();
		Car c = new Car();
		Bike b = new Bike();

		c.display();
		m.check(b);
		m.check(c);
	}
}
