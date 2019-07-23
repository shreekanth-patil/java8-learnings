package com.defaultmethods;

public class Person implements Human {

	public static void main(String args[]) {
		Human h = Human::run; // static method reference

		h.walk(); // invokes instance default method
		h.speak(); // as 'h' has static method run reference so it calls run method
		//no object is yet created for Person so h.speak() calls to static definition of run

		//Speak method can only be called from instance of Person or subclass of Person
		Human pp = new Person(); // now we got reference to Person object..
		pp.speak();

	}

	@Override
	public void speak() {
		System.out.println("Yes, Person belongs to Human category and can speak");

	}

}
