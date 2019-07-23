package com.lambda;

public class AnonymousEmployee {

	public static void main(String[] args) {
		
		// Anonymous object creation
		Employee nameInstance = new Employee() {
			@Override
			public void sayName(String name) {
				System.out.println("Employee Name is " + name);
			}
		};
		myName(nameInstance, "Sunil");

	}

	private static void myName(Employee nameInstance, String name) {
		nameInstance.sayName(name);
	}

}
