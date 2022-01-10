package com.revature;

import java.io.IOException;

public class MainDriver {
	
	/*
	 * Like (almost) everything else, Exception is a class. 
	 * 
	 * When the normal flow of programming does not go to plan, an exception 
	 * 	is "thrown"
	 * 
	 * 2 ways of handling exceptions!: 
	 * 		We can catch it with a try-catch block
	 * 		try catch 
	 * 		try catch finally 
	 * 		try finally 
	 * 
	 * 		OR 
	 * 
	 * 		We can pass the responsibility up the chain, to the main method.!
	 * 
	 * 		throws! (NOT THE SAME AS THROW)
	 * 		Throws declares a method as a risky method! So now it's up to the invoking 
	 * 		method to prepare for the challenge.
	 * 
	 * 
	 * Exception and RuntimeException?
	 * 		Exception is a parent of RuntimeException. So all RuntimeExceptions are
	 * 		descendants of Exception as well. 
	 * 
	 * 		Exception (direct children of Exception Class) are considered Compile time
	 * 		Exceptions i.e. Checked Exceptions. 
	 * 
	 * 		Checked Exceptions FORCE you to handle it. 
	 * 
	 * 		Runtime Exception, does not force you to do it. But BOTH occur during Runtime. 
	 * 
	 * 
	 * 		Compile time exceptions occur during runtime BUT you have to handle it during 
	 * 		compile time. e.g. IOException, SQLExceptions, etc ... 
	 * 
	 * 		Runtime Exceptions don't need to be explicilt handled, they are direct child 
	 * 		classes of RuntimeException. The idea is that they are unlikely to happen so you are
	 * 		not forced to handle them during compile time. e.g. NullPointerExceptions, IndexOutOfBounds, etc.
	 */
	
	public static double divide(int a , int b) {
		
		double value = 0;
		
		
		
		try {
			//risky logic happens here!
			
			value = a/b;
			
			
			
		} 
		
		catch(ArithmeticException e) {
			// this block is executed, if the try block throws an exception!
			// MAKE SURE THIS CODE IS BULLETPROOF!
			
			
			System.out.println("I'm pretty sure, you passed in 0, don't do that!");
//			e.printStackTrace();
		} catch(RuntimeException e) {
			System.out.println("An exception occured, but... I'm not sure whatr!");
//			e.printStackTrace()	;
		} catch(Exception e) {
			System.out.println("I'm catching every exception right now!");
		} finally {
			//block of code, that will excecute regardless of if the try block succeedeed
			// or failed!
			// MAKE SURE THIS CODE IS BULLETPROOF!
			
			System.out.println("I'm inside finally!");
		}
		
		
		return value;
	}

	public static double riskyDivide(int a, int b) throws Exception{
		return a/b;
	}
	
	public static void readFromFile() throws IOException {
		throw new IOException();
	}
	
	public static void main(String[] args) {
		
		//Throw is a manual way of throwing an exception!
		
		try {
			System.out.println(riskyDivide(10, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			System.out.println(riskyDivide(10, 0));
//		} catch(RuntimeException r) { //Runtime is a child of Exception , so it won't catch Exception throws!
//			r.printStackTrace();
//		}
		
		try {
			readFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exist!");
			e.printStackTrace();
		}
		

	}

}
