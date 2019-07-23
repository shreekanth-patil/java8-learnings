package com.lambda;

import java.util.Arrays;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		
		//Alternatively, you may explicitly provide the type of the parameter, wrapping the definition in brackets. For example:
		System.out.println("-------------------------------------------");
		Arrays.asList( "a1", "b2", "d3" ).forEach( ( String e ) -> System.out.println( e ) );
		
		
		/*In case lambda’s body is more complex, it may be wrapped into square brackets, as the usual function definition in Java.
		For example:*/
		System.out.println("-------------------------------------------");
		Arrays.asList( "a3", "b3", "d3" ).forEach( e -> {
		    System.out.print( e );
		    System.out.print( e );
		} );


/*		Lambdas may reference the class members and local variables (implicitly making them effectively final if they are not).
		For example, those two snippets are equivalent:*/
		System.out.println("-------------------------------------------");
		String separator = ",";
		Arrays.asList( "a4", "b4", "d4" ).forEach( 
		    e -> System.out.print( e + separator ) );
		
	/*	
		Lambdas may return a value. The type of the return value will be inferred by compiler.
				The return statement is not required if the lambda body is just a one-liner.
				The two code snippets below are equivalent:*/
		
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		
		// mulitple lines and has return statement.
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
		    int result = e1.compareTo( e2 );
		    return result;
		} );
	}
	
	

}
