package com.revature.math;

public class Calculator {
	
	public int add(int x, int y) {
		System.out.println("Inside int add method!");
		return x + y;
	}
	
//	protected double add(int x, int y) { //only the parameter changes allow overloading, not anything else!
//		double total = x +y;
//		return total;
//	}
	
	public int add(int x, int y , int z) {
		return x +y +z;
	}
	
	public double add(int[] intArray) {
		double total = 0;
		for(int i: intArray) {
			total += i;
		}
		
		return total;
	}
	
	public void overloadedMethod(int a, String s) {
		
	}
	
	public void overloadedMethod(String s, int a) {
		
	}
	
	//3 ways to overload: 
	// change the number of arguments 
	// change the datatypes of the arguments
	// change the order of the parameters!

}
