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
	
	
	

}
