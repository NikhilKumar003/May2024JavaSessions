package Inheritance;

public class Car extends Vehicle {

	public final int keys() {
		return 3;
	}
	
	public void start() {
		System.out.println("car-- start");
		
	}
	
	public void stop() {
		System.out.println("car-- stop");
	}
	public void refuel() {
		System.out.println("car-- refuel");
	}
	public void brake() {
		System.out.println("car-- brake");
	}
	public static void billing() {
		System.out.println("car-- Billing");
	}
}
