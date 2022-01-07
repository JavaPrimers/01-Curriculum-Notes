package com.revature;

import com.revature.space.Planet;

public class MainDriver {

	public static void main(String[] args) {

		Object o = new Object();
		Object o2 = new Object();
	
//		System.out.println(o.equals(o2));; //vs
//		System.out.println(o == o2); //by default, Java will compare the memory space of the objects
//		
//		
//		System.out.println(o); //when we put an object in the println(), it calls the toString!
//		System.out.println(o.toString());
	
		Planet p = new Planet("Earth",1);
		Planet p2 = new Planet("Venus",0.8);
		Planet p3 = new Planet("Earth",1);
//		System.out.println(p);
//		System.out.println(p2);
//		System.out.println(p.equals(p3));
//		System.out.println(p.equals(p2));
//		System.out.println(p.equals(o));
		
		Object o3 = new Planet();
//		System.out.println(o3.getClass());
		
//		String s = "This is a string";
//		System.out.println(s);
		
		
		
		
		
		Planet earth = new Planet("Earth",1);
		Planet earthTwo = earth;
		
		earthTwo.setName("Earth 2.o");
		
		System.out.println(earth);
		
		Object obj = new Planet("fake planet",-1);
		
		Planet p4 = (Planet) obj; //this is a dangerous operation, it will crash if it ain't a planet!
		System.out.println(obj);
		
		
		while(true) {
			new Planet("fakey fake",2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
