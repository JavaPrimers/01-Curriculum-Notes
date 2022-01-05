package com.example.methods;

public class MethodsAndStuff {
	
	//By default we have to instantiate a Class to utilize the methods declared in the class. 
	
	/*
	 * What is the difference between an Object and a Class?
	 * 		The Class is the blueprint 
	 * 		The Object is the instantiation of that class. 
	 * 
	 * 		The Class as a "logical" entity, the object is a "physical" entity
	 */

	//A method at minimum requires a name, a return type 
	void aMethod() {
		
	}
	
	//if a method returns a value, the method MUST return the same datatype.
	int aMethod2() {
		return -45;
	}
	
	//When we pass in arguments, we must declare the parameters datatype
	public String aMethod3(String s) {
		return s;
	}

}
