package com.methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Shreekanth - from https://blog.idrsolutions.com
 * 
 *         Reference To an Instance Method Of An Arbitrary Object Of A
 *         Particular Type
 *
 */
public class ReferenceToInstanceMethodAOPT {

	/**
	 * @param args the command line arguments
	 */

	private static class Person {

		private final String name;
		private final int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

	}

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Albert", 80));
		persons.add(new Person("Ben", 15));
		persons.add(new Person("Charlote", 20));
		persons.add(new Person("Dean", 6));
		persons.add(new Person("Elaine", 17));

		List<Integer> allAges = ReferenceToInstanceMethodAOPT.listAllAges(persons, Person::getAge);
		//in-line usage
		Function<Person, Integer> f1 = Person::getAge;
		//Function<Person, Integer> f2 = (e) -> Person.getAge(e);
		
		//Lambda Form way of AOPT
		List allAges2 = ReferenceToInstanceMethodAOPT.listAllAges(persons, x -> x.getAge());
		Function<Person, Integer> f3 = x -> x.getAge();
		
		//Method Reference way of AOPT
		List allAges3 = ReferenceToInstanceMethodAOPT.listAllAges(persons, Person::getAge);
		Function<Person, Integer> f2 = Person::getAge;
		
		
		System.out.println("Printing out all ages \n" + allAges);
	}

	private static List<Integer> listAllAges(List<Person> person, Function<Person, Integer> f) {
		List<Integer> result = new ArrayList<>();
		person.forEach(x -> result.add(f.apply((Person) x)));
		return result;
	}

}
