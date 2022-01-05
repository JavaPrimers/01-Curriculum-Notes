package com.example;

import com.example.classes.ExampleClass;
import com.example.methods.MethodsAndStuff;

public class MainDriver {
	
	
	//main method
	public static void main(String[] args) {
		System.out.println("Hello to my first Java project!");
		
		MethodsAndStuff obj = new MethodsAndStuff();
		
		System.out.println(obj.aMethod3("A String"));
		
		//What is a declaration?
		//We're allocating 'space' or memory for a variable of a certain datatype. 
		//Because Java is Strongly typed, we declare variables with their datatype. 
		
//		int a;
//		String s;
//		Object o;
		
		//What is assignment?
//		a = 4;
//		a = 12; //values can be reassigned, by default 
//		a = true; //in Java we can't assign a value that does not match the variables datatype.
		
		//What is instantation?
		new Object();
		new MethodsAndStuff();
		
		//Declaration, instantiation and assignment 
		Object o1 = new Object();
		
		//primitives vs objects
		//Primitive is a very simple datatype, it stores just values. 
		//Unlike Objects, that can have methods or multiple states associated with it. 
		
		
		//primitives are so simple we can define their memory allocation in bytes. 
		byte by = 1; // stores exactly a byte amount of memory (8 bits)
		int i = 10; //4 bytes - store integer values, up to 2^32
		boolean b = false; // we only need a single bit BUT Java stores it with a byte (8 bit)
		float f = (float) 123.301; //4 bytes
		long l = 1000000000; //8 bytes - store large integer values
		short s = 22; //2 bytes - stores 2 bytes of value
		double d = 123.301; //8 bytes - more precise than a float but more memory needed 
		char c = 'a'; //2 bytes - stores a single character value
		
		
		//basic syntax convention 
		
		//kiwi // a variable, a primitive or a object 
		//Kiwi // A Class 
		//kiwi() // a (static) method
		
		//kiwi.apple // kiwi is an object, apple is an attribute of the kiwi
		//kiwi.apple() // apple is a method of kiwi, which is an object. 
		
		//kiwi.applesAndStuff();
		
		//Classes use TitleCase
		// variables and methods use camelCase , the first word is in lowercase
		// packages are always lowercase
		
	    //methodsandstuff.Kiwi.apple.stuff(); 
		//stuff is a method of apple object, which belongs to the Kiwi class, which belongs to methodsandstuff package
	
		
		ExampleClass obj1 = new ExampleClass();
		obj1.aMethod();
		obj1.dance(12);
		
		obj1.name = "Bob";
		obj1.booleanValue = true;
		obj1.wholeNumber = 2;
		
		System.out.println(obj1.name); //null
		System.out.println(obj1.booleanValue); //false
		System.out.println(obj1.wholeNumber); //0
		
			
		obj1 = new ExampleClass(12,"Frank"); //obj1 has been rewritten with a new object. 
		
		System.out.println(obj1.name); //null
		System.out.println(obj1.booleanValue); //false
		System.out.println(obj1.wholeNumber); //0
		
		obj1.aMethod();
		
		
		//Access Modifiers
		//Variables Scopes
		// Array (how's it differnt to JavaScript)
	}
}
