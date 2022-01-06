package com.revature;

import com.revature.animalkingdom.Animal;
import com.revature.animalkingdom.Dog;
import com.revature.animalkingdom.GermanShepard;
import com.revature.bank.Account;
import com.revature.vehicle.BensCar;
import com.revature.vehicle.Car;
import com.revature.vehicle.CompletedCar;
import com.revature.vehicle.PhongsCar;
import com.revature.vehicle.ToyotaCar;
import com.revature.vehicle.Truck;

public class MainDriver {
	
	/*
	 * Inheritance: 
	 * 
	 * 		Is one of the most important aspects of OOP, allows you to reuse code by inheriting 
	 * 		methods and variables from parent classes. 
	 * 
	 * 		In Java we use extends keywords (for homogenous) inheritance:
	 * 			class -> class
	 * 			interface -> interface
	 * 			abstract class -> class
	 * 			class -> abstract class
	 * 			
	 * 
	 * 		For hetrogenous inheritance we use implements: 
	 * 			interface -> class 
	 * 			interface -> Abstract class
	 * 			
	 * 
	 * 		In Java, we have support for multilevel inheritance but not multiple parents.
	 * 		
	 * 		A -> B -> C
	 * 
	 * 		We DON'T inherit Constructors. We don't inherit them, we simply invoke our parents methods.
	 * 		(If it belongs to me, the object, then I use the this keyword! if it belongs to my parent, 
	 * 		(I use the super keyword)
	 * 
	 * Polymorphism: 
	 * 		Is to take many forms. From inheritance we get to reuse code, implemented by our parent classes. 
	 * 		But we can also modify them to suit our needs!
	 * 
	 * 		Overriding:
	 * 			Using the same method signature of the parent class method, but with a different implementation
	 * 			(code is different in the method body)
	 * 
	 * 			Same method signature means, the same name, same parameters, same return type. 
	 * 			(the access modifier cannot be any more restrictive)
	 * 
	 * 			To override, one must inherit the method! and the method must not be final!
	 * 
	 * 			Run time polymorphism.
	 * 
	 * 		Overloading
	 * 			Is for methods in the same class!
	 * 
	 * 			Same method name, but different parameters (number, datatypes or order)
	 * 
	 * 			Compiler time polymorphism!
	 * 			Overload Constructors and methods!
	 * 
	 * 		Encapsulation: 
	 * 			Practice of restricting access to resources within your objects or classes. This
	 * 			is stop any dangerous operations being done on them.
	 * 
	 * 			We achieve encapsulation with access modifiers: 
	 * 			public : Any and all classes in the project has access to this state or behavior!
	 * 			protected : Classes or entities outside of the package don't have access. The exception 
	 * 						being if they are child classes!
	 * 			(package): Classes or entites outside of the package don't have access. 
	 * 			private : only accessible to the class itself. 
	 * 
	 * 			To fully achieve encapsulation, we restrict direct access via the private keyword and 
	 * 			provide indirect access via public methods (getters and setters). 
	 * 
	 * Abstraction: 
	 * 			Related to complex. 
	 * 			Taking a concept, putting it in a way thats understandable. 
	 * 
	 * 			Programming: 
	 * 			The concept of hiding implementation to show functionality. 
	 * 			IRL, similar to a car. Different car manufacturers have different ways they 
	 * 			make cars, that function as cars. 
	 * 
	 * 			In Java we use 2 entities, Abstract classes and interfaces to achieve abstraction
	 * 			(partial and complete abstraction)
	 * 
	 * 			What the heck are abstract methods?
	 * 				Abstract methods are designed to be overridden! For a child class to override the 
	 * 				parent abstract method and provide an implementation. 
	 * 			
	 * 				If a child class does not implement ALL abstract methods, then it too must be a 
	 * 				ABSTRACT class.
	 * 
	 * 				Abstract methods cannot be final or static. 
	 * 
	 * 			Interfaces: 
	 * 				REALLY DIFFERENT TO CLASSES	
	 * 				Interfaces don't have constructors! (You cannot directly instantiate a interface)
	 * 				Implicitly: 
	 * 					All Methods are public and abstract. 
	 * 					variable are public static final
	 * 				Classes can implement multiple interfaces. 
	 * 				CANNOT BE STATIC or FINAL.
	 * 
	 * 			Abstract Classes are a lot closer to classes: 
	 * 				They have constructors (like classes)
	 * 				They can have attributes/states (like classes)
	 * 				They can have concrete methods (like classes)
	 * 
	 * 				An abstract classes does NOT need an abstract method to be abstract. 
	 * 				BUT if the class has an abstract method, then the class MUST be abstract. 
	 * 
	 * 				Abstract classes, even though have constructors, cannot be instantiated. 
	 * 				(Even if all methods are concrete)
	 * 
	 * 				A class cannot extend multiple parent abstract classes!
	 * 			
	 */
	
	public static void main(String... args) {
		
		Animal a = new Animal("Animal",1.0,1); //Does not have access to its child methods or states!
//		a.makeNoise();
//		a.sleep();
//		a.fetch();
//		a.checkingForNarcotics();
		
		Dog d = new Dog();
//		d.makeNoise();
//		d.sleep();
//		d.fetch();
//		d.checkingForNarcotics();
		
		GermanShepard bob = new GermanShepard();
//		bob.makeNoise();
//		bob.sleep();
//		bob.fetch();
//		bob.checkingForNarcotics();
		
//		Calculator c = new Calculator();
//		
//		c.add(1, 2);
//		c.add(1, 2,3);
//		c.add(1,2);
		
		Account account = new Account("Bob",100);
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
//		account.balance = -100;
		account.setBalance(-100);
		
		account.toString(); //converts into a string. 
		
		System.out.println(account.getBalance());
		
		
		Car car = new PhongsCar();
		
		car = new ToyotaCar();
		
		Truck t = new ToyotaCar();
		
		car.accelerate();
		car.brake();
		car.steer();
		car.refuel();
		
		
		BensCar bcar = new CompletedCar();
		
		bcar.toString();
		
		
		
		//Stack and the Heap 
		//Reference vs primitive variables!
		//var args
		
	}

}
