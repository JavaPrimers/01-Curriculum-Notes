package com.revature.vehicle;

import com.revature.animalkingdom.Animal;

public class ToyotaCar extends Animal implements Car, Truck{

	@Override
	public double accelerate() {
		
		System.out.println("Toyota's implementaiton!");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean brake() {
		System.out.println("Toyota's implementaiton!");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String steer() {
		System.out.println("Toyota's implementaiton!");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double refuel() {
		System.out.println("Toyota's implementaiton!");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean carryStuff() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void goOffRoading() {
		// TODO Auto-generated method stub
		
	}

}
