package com.revature.space;

//POJO - Plain old java object
//Think of these objects as purely to keep track of state!
public class Planet {
	
	private String name;
	private double mass;
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planet(String name, double mass) {
		super();
		this.name = name;
		this.mass = mass;
		System.out.println("Made a new planet!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	@Override
	public String toString() {
		return "I am a planet, my name is: " + this.name + " and my mass is: "+ this.mass;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Planet) { //We're checking if it's actually a planet!
			Planet p = (Planet) obj; //we're explicitly turning this into a planet!
				
			if(this.name.equals(p.name) && this.mass == p.mass) { //if the attributes match!
				return true;
			}
		}
		return false;
	}
	
	@Override
	protected void finalize() {
		System.out.println("I'm being destroyed!");
	}
	
	

}
