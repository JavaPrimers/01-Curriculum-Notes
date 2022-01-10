package com.revature;

import com.revature.space.Planet;

public class MainDriver {
	
	public static void aMethod() {
		Planet p = new Planet("Neptune",6);
	}

	public static void main(String[] args) {

		Object o = new Object();
		Object o2 = new Object();
	
//		System.out.println(o.equals(o2));; //vs
//		System.out.println(o == o2); //by default, Java will compare the memory space of the objects
//		
//		
//		System.out.println(o); //when we put an object in the println(), it calls the toString!
//		System.out.println(o.toString());
	
//		Planet p = new Planet("Earth",1);
//		Planet p2 = new Planet("Venus",0.8);
//		Planet p3 = new Planet("Earth",1);
//		System.out.println(p);
//		System.out.println(p2);
//		System.out.println(p.equals(p3));
//		System.out.println(p.equals(p2));
//		System.out.println(p.equals(o));
		
//		Object o3 = new Planet();
//		System.out.println(o3.getClass());
		
//		String s = "This is a string";
//		System.out.println(s);
		
		
		
		
		
//		Planet earth = new Planet("Earth",1);
//		Planet earthTwo = earth;
		
//		earthTwo.setName("Earth 2.o");
		
//		System.out.println(earth);
		
//		Object obj = new Planet("fake planet",-1);
		
//		Planet p4 = (Planet) obj; //this is a dangerous operation, it will crash if it ain't a planet!
//		System.out.println(obj);
		
		
		
		//One of the most useful featurs in Java
		//Garbage Collection!
		
		//GC is the reason why we as programmers don't need to worry about memory allocation. 
		//NEgligent coding in this regard, will still lead to a memory error. 
		
		//GC is a daemon thread. 
		// A thread is an isolated process.
		// daemon thread is a background thread that is always running. 
		// it's purpose is to clear the HEAP memory, not the STACK. 

		//It removes objects that are eligible for removal, what does it take for an object
		// to be eligibile? 
		// UNREACHABLE!
		
		new Object(); // an object that has been instantiated in the heap. 
//		new Planet("Mercury",0.2);
		// BUT there is no way for me reference this object once it's been instantiated!
		
//		Ways to remove references
		
		//Nullify the reference
		Object reference = new Object();
		reference = null; //only reference variables can be null
//		int a = null; //primitives cannot be null;
		
		//Re-assign the reference:
		Object reference2 = new Object();
		reference2 = new Object();
		
//		aMethod();
		
		//You can try to manually call the Garbage Collector, but it's more of a suggestion
//		System.gc(); // But this might not actually do anything!
		
		
		//There is a method called finalize, and this method belong to the Object class. 
		//The gc, will call this method just before garbage collecting the Object in memory
		
		Planet pluto = new Planet("Pluto",0.1);
		
		pluto = null;
		System.gc();
		
		while(true) {
			new Planet("Pluto",0.1);
		}
		
		// What is the difference between String, StringBuilder and StringBuffer? 
		// (Hint: look at the immutability)
		// Collection Hierarchy (Focus on the interfaces) 
		// Make a custom Exception and throw it! 
		// Maven (package manager) 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
