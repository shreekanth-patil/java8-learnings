package com.methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Shreekanth  - from https://blog.idrsolutions.com
 * 
 * Reference To An Instance Method Of A Particular Object
 * System.out is an instance of type PrintStream, we call the println method 
 * of the instance.
 *
 */
public class ReferenceToInstanceMethodOAPO {

	/**
	 * @param args the command line arguments
	 */

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Richard");
		names.add("Samuel");
		names.add("Rose");
		names.add("John");

		ReferenceToInstanceMethodOAPO.printNames(names, System.out::println);

		System.out.println("--------------------------");
		
		// Lambda Form
		ReferenceToInstanceMethodOAPO.printNames(names, x -> System.out.println(x));
		System.out.println("--------------------------");
		// in line usage
		Consumer<String> c1 = x -> System.out.println(x);

		// Method Reference
		ReferenceToInstanceMethodOAPO.printNames(names, System.out::println);
		System.out.println("--------------------------");
		// in line usage
		Consumer<String> c2 = System.out::println;

	}

	private static void printNames(List<String> list, Consumer<String> c) {
		list.forEach(x -> c.accept(x));
	}

}
