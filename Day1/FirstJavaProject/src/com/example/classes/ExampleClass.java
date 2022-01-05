package com.example.classes;

public class ExampleClass {
	
	//Within a class we can effectively define 3 categories, for an instance of our class. 
	
	//Constructors
	//States
	//Behaviors 
	
	
	//states
	//An instance of our ExampleClass will be able to store 3 different states. 
	// (We make them public so they are accessible anywhere in the project)
	public int wholeNumber;
	public String name;
	public boolean booleanValue;
	
	public void aMethod() {
		System.out.println("A method is being invoked!");
		
		//System comes from java.lang (imported by default) and is a Class
		//out is an object (static object of the class System)
		//println is a method of the out object.
	}
	
	public int dance(int number) {
		System.out.println(this.name + " is dancing!");
		return number;
	}

	
	//EVERY CLASS must have a Constructor.
	//If no Constructor is defined, the JVM will provide a constructor. (default constructor)
	//Default constructor is *only* provided when no constructors are defined. 
	
	//A constructor will have the same name as the class and with no return type. 
	//In typescript, we would have a "constructor" defined and use optional parameters. 
	
	//no args constructor!
	public ExampleClass() {
		this.name = "Placeholder";
		this.booleanValue = false;
		this.wholeNumber = 0;
	}
	
	//overloading - example of polymorphsism
	public ExampleClass(int number) {
		this.wholeNumber = number;
	}
	
	public ExampleClass(int number, String name) {
		this.wholeNumber = number;
		this.name = name;
		this.booleanValue = true;
	}
}
