package com.revature.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CollectionDriver {
	
	/*
	 * Collection Framework: 
	 * 
	 * 		Introduces new Data structures into Java for developers leverage. 
	 * 
	 * Why?
	 * 		Arrays in Java are quite limited to work with (It's only a List, elements
	 * 		are based around positions and the array itself is immutable).
	 * 
	 * 		I could create my own custom version of a data structure. It's likely to 
	 * 		be poorly optimized, it's also difficult to share data structures between 
	 * 		developers. 
	 * 
	 * 		This is the part where Collection Framework comes in!
	 * 
	 * Called a framework (more akin to a library). It provides interfaces and classes that
	 * 	allow developers to more easily manage groups of objects. 
	 * 	A 'collection" object is designed to store a group of objects and offer methods 
	 * 	to manipulate the data inside more easily. 
	 * 
	 * Advantages: 
	 * 		Reduces effort 
	 * 		Increases performance 
	 * 		Encourages software reuse. 
	 * 
	 * Disadvantages
	 * 		Does not allow primitives inside (Have to use Wrapper Classes)
	 */

	public static void main(String[] args) {
		
//		Collection c = null;
//		
//		c.add(new Object());
//		c.remove(new Object());
//		c.size();
	
		/*
		 * We use generics with our data structures to enforce type safety!
		 */
		List<String> listOfStrings = new ArrayList<>();
		
		listOfStrings.add("A String");
		listOfStrings.add("Many Strings");
		listOfStrings.add("All the strings we want");
//		listOfStrings.add(new Object()); //Once type safety is added, only those objects can be added!
		
		
//		System.out.println(listOfStrings.get(0).isEmpty());
		
		
		Queue<String> stringQueue = new LinkedList<>();
		stringQueue.add("A String");
		stringQueue.add("2nd String");
		stringQueue.add("3rd String");
		
		List<String> stringList = new LinkedList<>();
		stringList.add("A string");
		stringList.get(0);
		stringList.remove(0);
		
		
//		System.out.println(stringQueue.get(1)); //get belongs to the List, where we access
													//via position. 
//		System.out.println(stringQueue.poll());
//		System.out.println(stringQueue.poll());
//		System.out.println(stringQueue.poll());
//		System.out.println(stringQueue.poll());
//		System.out.println(stringQueue.poll());
		
		
		Set<String> stringSet = new HashSet<>();
		
		stringSet.add("A String");
		stringSet.add("A String3"); //Set does not accept duplicate values
		System.out.println(stringSet.add("A String2"));
		System.out.println(stringSet.add("A String"));
		
//		System.out.println(stringSet.get(0));//no positional access
//		System.out.println(stringSet.element()); //no insertion order related methods!
		
		
		System.out.println(stringSet);
		
//		for(int i = 0; i< stringSet.size(); i++) {
//			System.out.println(stringSet[0]);// just for arrays, doesn't work!
//			System.out.println(stringset.get(i));// just for List, dooesn't work!
//			System.out.println(stringSet.poll());// just for Queeues, doesn't work!
//		}
		
		//for each loop!
		//Any and all Collection entites can levarage the for each loop!
		//This is possible, because The Collection is a child interface of 
		//	Iterable!
		
		Object o = new Object();
		for(String s: stringList) {
			System.out.println(s);
		}
		
		/*
		 * List (Interface) : 
		 * 		An ordered collection. 
		 * 		May contain duplicate elements. 
		 * 		Access via index (positional index)
		 * 
		 * 		Child Classes: 
		 * 			ArrayLists
		 * 			LinkedLists
		 * 
		 * 
		 * Queue (interface): 
		 * 		An ordered collection of objects, with relation to its insertion order. 
		 * 		Follows the FIFO/LILO (First in First out/Last in Last out) principle.
		 * 
		 * 		There is a Stack interface that reverses the behavior of the queue. 
		 * 		Making it LIFO/FILO (First in Last Out)
		 * 
		 * 		Methods;
		 * 			poll, remove, peek and element
		 * 
		 *  	Child classes: 
		 *  		LinkedList
		 *  		PriorityQueue
		 * 
		 * Set (Interface): 
		 * 		A very simple data structure compared to the other 2. 
		 * 			(Only inherits methods from the Collection + duplicate restriction)
		 * 		Does not allow duplicates. 
		 * 		Does not guarantee insertion order
		 * 
		 * 		Child Classes: 
		 * 			HashSet: (Maintains no order, stores values in hash tables, best performance)
		 * 			LinkedHashSet
		 * 			TreeSet
		 * 
		 */
	}

}
