package com.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

/**
 * @author shreekanth
 * 
 *         Whenever we need to traverse through a Collection, we need to create
 *         an Iterator whose whole purpose is to iterate over and then we have
 *         business logic in a loop for each of the elements in the Collection.
 *         We might get ConcurrentModificationException if iterator is not used
 *         properly.
 * 
 *         Java 8 has introduced forEach method in java.lang.Iterable interface
 *         so that while writing code we focus on business logic only. forEach
 *         method takes java.util.function.Consumer object as argument, so it
 *         helps in having our business logic at a separate location that we can
 *         reuse. Let’s see forEach usage with simple example.
 *
 */
public class Java8ForEachDemo {

	public static void main(String[] args) {

		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		// traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator Value::" + i);
		}

		// traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::" + t);
			}

		});
		
		myList.forEach(e-> System.out.println("forEach  Value:: lambda way "+e));

		// traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

	}

}

// Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::" + t);
	}

}