

//This is a comment in Java

//We define a class
public class HelloWorld{

	
	//In Java we can define Methods. 
	//In Java we don't use the function keyword, we do need to define a return value
	void aMethod(){
		//lots of important code here!	
	}

	//A method is a function that belongs to an object. 
	int anotherMethod(){
		//more important code here!
		return 27;
	}


	
	//We define the entry point for our JVM
	//This is the main method!

	public static void main(String[] args){
	
		System.out.println("Hello World");

		HelloWorld helloWorldObject = new HelloWorld();	
	
		helloWorldObject.aMethod();

		System.out.println(helloWorldObject.anotherMethod());
		
		for(int i = 0; i < args.length; i++ ){

			System.out.println(args[i]);
		}
	}
}