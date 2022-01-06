package com.revature.datastructure;

public class Arrays {
	
	/*
	 * Arrays are the most basic data structure that we have in Java. 
	 * 
	 * Properties of Arrays: 
	 * 		indexed list of objects, datatypes. 
	 * 		In JS arrays will automatically reorder, in Java you'll have to do it manually. 
	 * 		Group of values, the same datatype. (in contrast to JS)
	 * 		It has the size of the array. 
	 * 		When initalizing an array, you have to provide length.
	 * 		In Java you also have to declare the datatype as you're creating it. 
	 * 
	 * 
	 * 		Array is an indexed based data structure that can store objects or primitives. 
	 * 		Arrays are immutable, so once they are created their length (i.e. the number of indexes)
	 * 			cannot be changed. 
	 * 		Arrays can only store values of the same datatype. 
	 */
	
	public static void main(String[] kiwi) {
			
		//To declare an array, there's actually 2 ways 
		String[] stringArray;
		String weirdStringArray[];
		int[] intArray;
		
		
		stringArray = new String[10]; //This will initalize an array of Strings with 10 positions.
		stringArray = new String[7];
//		stringArray = {"Bob"}; // this won't work because we have to do this all on the same line
		
		String[] newStringArray = {"Bob","Bobby","Bobert"}; //We initalize the array with a single postion and a value of "Bob"
	
		
		//multidimensional arrays 
		Double[][][] spacePosition = {{{123.0,12.0,7.3},{12.3}}};
		
		System.out.println(spacePosition[0][0][0]);
		
		
		//arrays are indexed, so we access via position: 
		System.out.println(newStringArray[1]);
		
		for(String s: newStringArray) {
			System.out.println(s);
		}
		
		for(int i = 0; i< newStringArray.length; i++) {
			System.out.println(newStringArray[i]);
		}
		
		
		
		
	}

}
