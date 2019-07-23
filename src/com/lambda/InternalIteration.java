package com.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author shreekanth
 * 
 *         Sometimes the strong guarantees of the for-each loop (sequential,
 *         in-order) are desirable, but often are just an disadvantage to
 *         performance. The alternative to external iteration is internal
 *         iteration, where instead of controlling the iteration, client let it
 *         handle by library and only provide the code which must be executed
 *         for all/some of data elements.
 *
 */
public class InternalIteration {

	public static void main(String[] args) {
		List<String> alphabets = Arrays.asList(new String[] { "a", "b", "b", "d" });

		alphabets.forEach(l -> System.out.println(l.toUpperCase()));
	}

}
