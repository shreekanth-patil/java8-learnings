package com.functionalInterface;

/**
 * @author shreekanth
 *
 *         In practice, the functional interfaces are fragile: if someone adds
 *         just one another method to the interface definition, it will not be
 *         functional anymore and compilation process will fail. To overcome
 *         this fragility and explicitly declare the intent of the interface as
 *         being functional, Java 8 adds special annotation @FunctionalInterface
 *         (all existing interfaces in Java library have been annotated
 *         with @FunctionalInterface as well). Let us take a look on this simple
 *         functional interface definition:
 */

@FunctionalInterface
public interface FunctionalInterfaceExample {

	public void saySomething();

	public default void talkSomething() {
		System.out.println("Yeah talk now..");
	}

	public static void doSomething() {
		System.out.println("Yeah do something..");

	}

}
