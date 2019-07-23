package com.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Shreekanth - from https://blog.idrsolutions.com
 * 
 * Reference to a static method
 *
 */
public class ReferenceToStaticMethod {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17);
		
		List<Integer> primeNumbers = ReferenceToStaticMethod.findPrimeNumbers(numbers,
				(number) -> ReferenceToStaticMethod.isPrime((int) number));

		System.out.println("Prime Numbers are " + primeNumbers);
		
		
		// a -> ReferenceToStaticMethod.isPrime(a) - lambda way of implementation
		List<Integer> LambdaFormPrimeNumbers = ReferenceToStaticMethod.findPrimeNumbers(numbers, a -> ReferenceToStaticMethod.isPrime(a));
		
		System.out.println("LambdaFormPrimeNumbers Prime Numbers are " + LambdaFormPrimeNumbers);
		
		//MethodReference way of implementation - 'ReferenceToStaticMethod::isPrime' shorter version of lambda representation 'a -> ReferenceToStaticMethod.isPrime(a)'
		List<Integer> MethodReferencePrimeNumbers = ReferenceToStaticMethod.findPrimeNumbers(numbers, ReferenceToStaticMethod::isPrime);
		
		
		System.out.println("MethodReferencePrimeNumbers Prime Numbers are " + MethodReferencePrimeNumbers);
		
		//Example: Here right side is the method implementation of Predicate interface 'test' -returns boolean: Awesome :)
		//lambda way of implementation
		Predicate<Integer> predicate1 = (a) -> ReferenceToStaticMethod.isPrime(a);
		
		//MethodReference way of implementation  - This short version of above line it is called method reference
		Predicate<Integer> predicate2 = ReferenceToStaticMethod::isPrime;
	}

	public static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> findPrimeNumbers(List<Integer> list, Predicate<Integer> predicate) {
		List<Integer> primeNumbers = new ArrayList<>();
		
		list.stream().filter((i) -> (predicate.test(i))).forEach((i) -> {
			primeNumbers.add(i);
		});
		return primeNumbers;

	}

}
