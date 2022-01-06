package com.revature.astronomy;

public class NeutronStar {
	
	//nested class
	public static class Planet {
		String name;
		
	}; //nested classes can be used with a static modifier!
	
	public int temperature;
	public double mass;
	public double planksConstant;
	
	public static final double VALUE_OF_PI = 3.14; //when a value is static and final
	
	public NeutronStar() {
		
	}
	
	public NeutronStar(int temperature, double mass, double planksConstant) {
		this.temperature = temperature;
		this.mass = mass;
		this.planksConstant = planksConstant;
	}
	
	
	public void fusion() {
		System.out.println("I'm fusing!");
		
		Planet p = new Planet();
		p.name = "Earth 2.0";
		System.out.println("A new planet is born from this: " + p.name);
	}
	
	public void imploding() {
		System.out.println("I'm imploding!");
		this.fusion(); //non-static method can refer to other non-static methods or states
		System.out.println("The mass is still the same: " + this.mass);
		
		//non-static methods can refer to static methods or variables
		spittingOutFacts();
		
	}
	
	public static void spittingOutFacts() {
		System.out.println("Neutron Stars spin really fast!");
		System.out.println("The value of pi is: " + VALUE_OF_PI); //Static methods can reference other static variables
	
//		this.imploding(); // This won't work if no object has been created.
		//static methods cannot refer to other non-static methods or variables!
	}

}
