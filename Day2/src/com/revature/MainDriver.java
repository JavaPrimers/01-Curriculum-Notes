package com.revature;

import com.revature.astronomy.NeutronStar;
import com.revature.astronomy.NeutronStar.Planet;

public final class MainDriver {
	
	/*
	 * In Java we have 2 categories of modifiers
	 * 
	 * Access Modifiers and Non-Access Modifiers
	 * 
	 * Access Modifiers: 
	 * 		public 
	 * 		protected
	 * 		package (implicit)
	 * 		private 
	 * 
	 * Non-Access Modifiers change the default behavior of Java: 
	 * 		static : 
	 * 			Static can be used next to classes, state and methods!
	 * 			Anything static, will belong to the Class itself, not just the object!
	 * 			(static can only be used with nested classes)
	 * 		final : 
	 * 			Final can also be used in the context of a Class, variable or method.
	 * 			variable: create a constant value, the variable can't be reassigned another value
	 * 			methods: final methods cannot be overridden 
	 * 			Class: That the entire class cannot be extended (inheritance ends with that class)
	 * 		abstract :
	 * 			Can be used in front of a Class or a method.
	 * 			Class: Abstract class tells the JVM that this is an abstract class (0 or more abstract methods)
	 * 			Method: Abstract method, is a method without any implementation (not concrete)
	 * 			Cannot use abstract and final together! (Abstract classes can't be instantiated)
	 */
	
	public static void main(String[] args) {
		//System.out.println("Hi!");
		
		//To have fusion, we must have a star in the first place
		
		NeutronStar pulsar = new NeutronStar();
//		
//		pulsar.fusion();
		pulsar.imploding();
		
//		NeutronStar.fusion();
//		NeutronStar.imploding();
		
		NeutronStar.spittingOutFacts();
		System.out.println(NeutronStar.VALUE_OF_PI);
		
		Planet p = new Planet(); //Outside of the class, we need to instantiate the Star itself to access
										// the planet constructor!
		
		final int a = 10;
//		a = 12; // a is final, so can't be reassigned another value!
	}

}
