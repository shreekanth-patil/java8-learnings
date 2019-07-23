package com.lambda;

import java.util.Arrays;
import java.util.List;


/*
 * 
 External iteration is straightforward enough, but it has several problems:

 1) Java’s for-each loop/iterator is inherently sequential,
 and must process the elements in the order specified by the collection.
 
 2) It limits the opportunity to manage the control flow,
 which might be able to provide better performance by exploiting reordering of the data,
 parallelism, short-circuiting, or laziness.

 */

public class ExternalIteration {

	    public static void main(String[] args){
	        List<String> alphabets = Arrays.asList(new String[]{"a","b","b","d"});
	         
	        for(String letter: alphabets){
	            System.out.println(letter.toUpperCase());
	        }
	    }
	}
