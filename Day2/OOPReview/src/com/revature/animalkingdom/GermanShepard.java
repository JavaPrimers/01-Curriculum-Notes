package com.revature.animalkingdom;

public class GermanShepard extends Dog{
	
	boolean obedience;
	
	public GermanShepard(String name, double mass, int age, double maxSpeed, boolean obedience) {
		super(name,mass,age,maxSpeed);
		this.obedience = obedience;
	}
	
	public GermanShepard() {
		this("fake",0,0,0,false);
	}

	public void checkingForNarcotics() {
		System.out.println("I've got a really good nose for narcotics!");
	}
	
	
//	public void sleep() {
//		//I can inherit final method!
//		//I cannot override final methods!
//	}
	
	public void exampleMethod() {
		this.fetch(); //This is the German shepards fetch method
		super.fetch(); //this is the dog's fetch method!
		
		this.makeNoise(); //This is the German Shepards make noise method!
		super.makeNoise(); //This is the Dog's make noise method. 
	}
	
	
}
