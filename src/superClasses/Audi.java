package superClasses;

public class Audi extends Car {
	
	public Audi() {
		super();// its mandatory to add super in default constructor as 1st statement 
		System.out.println("Audi-- default const");
	}
	public Audi(int a) {
		super(259);
		System.out.println("Audi-- const"+ " "+a);
	}
	public Audi(int a, int b) {
		super(24, 36);
		System.out.println("Audi-- default const"+" "+(a+b));
		System.out.println("Audi-- speed" +" "+ super.speed);
	}
	
}
