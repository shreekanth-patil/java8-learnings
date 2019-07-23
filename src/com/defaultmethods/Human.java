package com.defaultmethods;

@FunctionalInterface
public interface Human {
	
	public void speak();
	
	public default void walk() {
		System.out.println("Yeah Person is an human being with walk feature");
	}
	
	public static void run() {
		System.out.println("Yeah Person is an human being with run feature");
	}
}
