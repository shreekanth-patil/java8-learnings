package com.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFuncationlInterfaceDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Anil");
		names.add("Kiran");
		names.add("sunil");

		//forEach is consuming from names collection and printNames is supplying to Supplier object reference arg
		names.stream().forEach((x) -> {
			printNames(() -> x);
		});
 
	}

	static void printNames(Supplier<String> arg) {
		System.out.println(arg.get()); // getting from Supplier object
	}

}
