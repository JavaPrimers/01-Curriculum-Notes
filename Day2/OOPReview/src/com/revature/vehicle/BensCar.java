package com.revature.vehicle;

public abstract class BensCar extends Object implements Car{

	@Override
	public boolean brake() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double accelerate() {
		// TODO Auto-generated method stub
		
		//if this is an important method THAT I HAVE TO DO MYSELF
		
		return 0;
	}

	@Override
	public String steer() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public abstract double refuel();
	
	public abstract String bangingRadio();

}
