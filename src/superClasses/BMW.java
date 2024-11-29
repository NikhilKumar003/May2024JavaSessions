package superClasses;

public class BMW extends Car {

	int speed =300;
	@Override
	public void start() {
		super.start();
		System.out.println("BMW -- start");
//		start();
		super.stop();
		super.refuel();
	}
	
	public void autoPark() {
		super.start();
		System.out.println("Bmw-- Auto parking");
		
	}
	
	@Override
	public void refuel() {
		System.out.println("BMW -- refuel");
	}
	
	public void displaySpeed() {
		System.out.println("car speed is : "+ speed);
		System.out.println("Bmw speed is : "+ super.speed);
	}
}
