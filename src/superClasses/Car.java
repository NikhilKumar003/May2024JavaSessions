package superClasses;

public class Car {
	
	int speed =100;
	
	public void start() {
		
		System.out.println("car -- start");
		
	}

	public void stop() {
		System.out.println("car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public Car() {
		System.out.println("Car-- default const");
	}
	public Car(int a) {
		
		System.out.println("Car-- const"+" "+  a);
	}
	public Car(int a, int b) {
		System.out.println("Car-- default const"+" "+(a+b));
	}
}
