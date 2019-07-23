package com.functionalInterface;

import java.util.function.Consumer;

public class ConsumerFuncationlInterfaceDemo {

	public static void main(String[] args) {

		Consumer<String> consumer = ConsumerFuncationlInterfaceDemo::printNames;

		consumer.accept("Jeremy");
		consumer.accept("Paul");
		consumer.accept("Richard");

	}

	private static void printNames(String name) {
		System.out.println(name);
	}

}
