package com.revature.exceptions;

public class UserDoesNotExistException extends Exception {

	@Override
	public void printStackTrace() {
		super.printStackTrace();
		System.out.println("User does not exist!");
	}
}
