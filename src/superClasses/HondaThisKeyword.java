package superClasses;

public class HondaThisKeyword extends Car {

	public HondaThisKeyword() {
		this(10);// its mandatory to add super in default constructor as 1st statement 
		System.out.println("Honda-- default const");
	}
	public HondaThisKeyword(int a) {
		this(12,12);
		System.out.println("Honda-- const"+ " "+a);
	}
	public HondaThisKeyword(int a, int b) {
		
		System.out.println("Honda-- default const"+" "+(a+b));
//		System.out.println("Audi-- speed" +" "+ super.speed);
	}
}
