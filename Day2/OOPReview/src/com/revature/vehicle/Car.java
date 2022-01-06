package com.revature.vehicle;

public interface Car extends Vehicle{

	//Interfaces in TS usually define the states and object or a class will have. 
	//In Java, interfaces are used to define behaciors. 
	
	//With an interface we define the method name, parameters and return type!
	//Effectively we are defining a contract!
	//All the methods, are implicilty public and abstract!
	
	//abstract means that the method has no body!
	
	int NUMBER_OF_WHEELS = 4;
	
	public abstract double accelerate();
	
//	boolean brake();
	
	String steer();
	
	double refuel();
	
}
