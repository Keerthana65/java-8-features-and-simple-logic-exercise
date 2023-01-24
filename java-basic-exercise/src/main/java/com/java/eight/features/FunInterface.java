package com.java.eight.features;

public class FunInterface implements House {

	@Override
	public void ownerMethod() {
		System.out.println("I'm the owner of this house");
	}

	// Using Basic Java
	public static void main(String[] args) {
		FunInterface funInterface = new FunInterface();
		funInterface.ownerMethod();
		System.out.println(House.payment(1500d));
	}

}

@FunctionalInterface
interface House {
	void ownerMethod(); // Should be override

	default String rentMethod(String s) { // Can be override this method but not mandatory
		return "House rented to Mr. " + s;
	}

	public static String payment(double amount) { // Can't be override this method
		return "Rent amount " + amount + " has to be paid";
	}
}
