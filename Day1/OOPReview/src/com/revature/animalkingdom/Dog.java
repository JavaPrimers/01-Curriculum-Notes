package com.revature.animalkingdom;

public class Dog extends Animal{
	
	/*
	 * Default constructor provided by the JVM: 
	 * 
	 * public Dog(){
	 * 	super(); //when we see super we are referring to our parent!
	 * }
	 */
	
	public double maxSpeed;
	
	public Dog() {
		//even if I don't write super(), it will be the first line of any constructor!
		super("fakey fake name",1.0,0);
		this.maxSpeed = 0;
	}
	
	public Dog(String name, double mass, int age, double maxSpeed) {
		super(name,mass,age);
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
	public void fetch() {
		System.out.println("I'm fetching something!");
	}
	

	public void makeSound() {
		//THIS IS NOT OVERRIDING 
		//IVE JUST DEFINED A BRAND NEW METHOD!
	}
	
	@Override //(optiional) to reinforce the fact that this method is being overriden!
	public void makeNoise() {
	//is when we replace the implementation of a parent with our own!
	//right now, I've got absolutely nothing! 
		
		System.out.println("Barking and stuff!");
	}
	
	
	public final void sleep() {
		super.sleep(); //I get my parents functionality 
		System.out.println("Sleeping like a dog!");
	}

}
