package com.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Shreekanth - from https://blog.idrsolutions.com
 *
 */
public class ReferenceToConstructor {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(4, 9, 16, 25, 36);
		
		List<Double> squaredNumbers = ReferenceToConstructor.findSquareRoot(numbers, Integer::new);
		
		//Lambda Form - x -> new Integer(x)
		List squaredNumbers1 = ReferenceToConstructor.findSquareRoot(numbers, x -> new Integer(x));
		//in line usage
		Function<Integer, Integer> f2 = x -> new Integer(x);
		
		//Constructor Method Reference - Integer::new
		List squaredNumbers2 = ReferenceToConstructor.findSquareRoot(numbers, Integer::new);
		//in line usage
		Function<Integer, Integer> f3 = Integer::new;
		
		System.out.println("Square root of numbers = " + squaredNumbers);
		
		
	}

	private static List<Double> findSquareRoot(List<Integer> list, Function<Integer, Integer> f) {
		List<Double> result = new ArrayList<>();
		list.forEach(x -> result.add(Math.sqrt(f.apply((Integer) x))));
		return result;
	}

}
