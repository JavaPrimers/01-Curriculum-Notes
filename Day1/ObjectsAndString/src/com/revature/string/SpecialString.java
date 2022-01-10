package com.revature.string;

import com.revature.space.Planet;

public class SpecialString {
	
	/*
	 * The String is a very special class in Java. 
	 * It's part of the lang library in Java, in fact we have to use it even run our Java
	 * 	projects.
	 * 
	 * The String class makes a lot of modification to the default behavior of objects. 
	 * 	In fact, it is a Final class. We CANNOT make any child classes of String, because 
	 * 	of how much important it is and how it manipulate memory.
	 * 
	 * Strings take up a special place in the heap. CAlled the String Pool. 
	 * Whenever a new String variable is created with a String literal
	 * 	e.g. String s = "String literals";
	 * The String class will look for an existing String literal and point it to that. 
	 * 
	 * String Class has a lot of useful methods to manipulate the value of the String
	 * 
	 * String is also immutable! We can't modify the String object!
	 * If we want to change it, we have to reassign it!
	 * Whenever we're making changes to a String, we're actually creating a new String literal
	 * 	in memory (unles if it already exists in the String pool)
	 * 
	 * 
	 * String
	 * 	
	 * 		String is an object that contians an array of characters. It allows you to create
	 * 		and manipulate strings. 
	 * 
	 * 		The String class is immutable and the class is final: 
	 * 			immutable: The string can't be changed. 
	 * 			final: The class cannot be extended
	 * 
	 * 		String "Objects" are stored in the heap but String literals are stored in the 
	 * 		String pool (which is also within the heap"
	 * 
	 * 		When a new String Object is created, it checks the String pool to see if the 
	 * 		string literal exists. 
	 * 
	 * 		String methods: 
	 * 			myStrings.charAt(n)
	 * 			myString.length()
	 * 			myString.subString(n,m)
	 * 			....
	 *  
	 */
	
	public static void main(String[] args) {
		
		
		
		String s = "Like this";
		String s2 = "Like this";
		String s3 = new String("Like this");
		
		System.out.println(s == s2); //Still not recommend to use ==, because it is still only using memory location
		System.out.println(s == s3);
		System.out.println(s.equals(s3));
		
		System.out.println(s.toUpperCase());
		s = s.toUpperCase();
		System.out.println(s);
		
		Planet p = new Planet("Important Planet",3);
		Planet p1 = p;
		Planet p2 = p;
		Planet p3 = p;
		Planet p4 = p;
		Planet p5 = p4;

		p5.setName("Fake");
		
		System.out.println(p);
	}

}
