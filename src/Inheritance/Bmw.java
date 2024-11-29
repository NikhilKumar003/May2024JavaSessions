package Inheritance;

public class Bmw extends Car {
	
	@Override
	public void start() {
		System.out.println("BMW-- start");
		
	}
	
	public void AutoParking() {
		System.out.println("BMW-- AutoParking");
	}
	@Override
	public void refuel() {
		System.out.println("BMW-- refuel");
	}
	@Override
	public void brake() {
		System.out.println("BMW-- brake");
	}
	@Override
	public void engine() {
		System.out.println("BMW-- engine");
	}
	public void bmwLoading() {
		Truck t2=new Truck();
		t2.loading();// composition
	}
}
