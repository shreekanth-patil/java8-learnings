package com.lambda;

public class LambdaEmployee {

	private static void myName(Employee nameInstance, String name) {
		nameInstance.sayName(name);
	}
	
	public static void main(String[] args) {
		myName(n -> System.out.println("employee name is " + n), "sunil");
	}
}
