
//It defines a namespace for a external Class or method. 
import mathstuff.Calculator;

public class MainDriver{

	public static void main(String[] args){
		System.out.println("Welcome to my Main Driver");

		Calculator calc = new Calculator();
		Calculator anotherCalc = new Calculator();

		System.out.println(calc.add(22,31));
	}
}