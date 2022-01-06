package com.revature.animalkingdom;

public class Animal extends Object{
	
	public String name;
	public double mass;
	public int age;
	
	public Animal(String name, double mass, int age) {
		this.name = name;
		this.mass = mass;
		this.age = age;
	}
	
	public Animal() {
		
	}
	
	public void makeNoise() {
		System.out.println("I'm making a noise!");
	}
	
	public void sleep() {
		System.out.println("Slumbies!");
	}

}
