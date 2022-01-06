package com.revature.bank;

public class Account {
	
	
	private String name;
	private double balance; 
	
	public Account(String name,double balance) {
		this.balance = balance;
		this.name = name;
		System.out.println("2 args");
	}
	
	public Account(String name) {
		this(name,0);
		System.out.println("1 args");
	}
	
	public Account() {
		this("Fakey fake");
		System.out.println("No args");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Getter and Setters
	// Provide a programatic access to our variables/states, in case if we want checks on any operation.
	
	//Getters
	
	

}
