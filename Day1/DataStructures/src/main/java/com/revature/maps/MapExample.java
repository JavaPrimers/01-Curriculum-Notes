package com.revature.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	/*
	 * Map IS NOT part of the Collection hierarchy!
	 * 
	 * Is an object that maps 'keys' to 'values' (also known as a dictionary in other
	 * 	languages). Each key has to be unique and can be mapped to only one value. (Note
	 * 	that a key can be mapped to duplicate values)
	 * 
	 * Child classes: 
	 * 		HashMap
	 * 		TreeMap
	 * 		LinkedHashMap
	 */
	
	public static void main(String[] args) {
		
		/*
		 * primitives cant be used in generics!
		 * 	So we have to use wrapper classes to turn them into objects!
		 * 	Wrapper classes encapsulates the value around an object, offering us more
		 * 		methods to manipulate the value. 
		 * 
		 * 	char -> Character
		 * 	int -> Integer
		 * 	double -> Double 
		 * 	boolean -> Boolean 
		 * 	short -> Short
		 * 	long -> Long 
		 * 	byte -> Byte 
		 * 	float -> Float
		 */
		
		int a = 2;
		Integer b = a; //auto boxing!
		
		int c = b; //unboxing
//		Integer c = new Integer(10); //deprecated, it's unnecessary boiler plate code. 
		
		
		
		Map<Integer,String> myMap = new HashMap<>();
		
		myMap.put(1, "Here's a value to store");
		myMap.put(27, "Here's another");
		myMap.put(33, "value");
		myMap.put(4, "value");
		myMap.put(-4, "anotherValue");
		
		System.out.println(myMap);
		
//		System.out.println(myMap.get(1));
		
		Set<Integer> keySet = myMap.keySet();
		Collection<String> valueCollection = myMap.values();
		
		for(Integer i: keySet) {
			System.out.println(myMap.get(i));
		}
		
		for(String s: valueCollection) {
			System.out.println(s);
		}
		
		
		//Anything can be a key, including other data structures!
//		Map<String[],String> anotherMap = new HashMap<>();
//		Map<Map<List<String>,String>,String> anotherMap2 = new HashMap<>();
//		
//		String[] a1 = new String[5];
//		String[] a2 = new String[7];
//		String[] a3 = {"key"};
//		
//		anotherMap.put(a1, "This is another value!");
		
	
		
		
		
//		for(Integer a: myMap) {
//			System.out.println(a);
//		}
	}

}
