package com.lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------");
		Arrays.asList("a1", "a2", "a3")
	    .stream()
	    .findFirst()
	    .ifPresent(System.out::println);  // a1
		
		System.out.println("---------------------------------");
		
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 4)
	    .average()
	    .ifPresent(System.out::println);  // 5.0
		
		System.out.println("---------------------------------");
		
		Stream.of("a1", "a2", "a3")
	    .map(s -> s.substring(1))
	    .mapToInt(Integer::parseInt)
	    .max()
	    .ifPresent(System.out::println);  // 3
		
		System.out.println("---------------------------------");
		
		/*
		 * Stream.of("d2", "a2", "b1", "b3", "c") .filter(s -> {
		 * System.out.println("filter: " + s); return true; });
		 */
		
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("A");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));

	}

}
