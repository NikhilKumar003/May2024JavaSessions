package Inheritance;

public class Audi extends Car  {
	
	@Override
	public final void start() {
		System.out.println("Audi-- start");
		
	}
	
	@Override
	public void stop() {
		System.out.println("Audi-- stop");
	}
	
	public static void theftSafety() {
		System.out.println("Audi-- refuel");
	}
	@Override
	public void brake() {
		System.out.println("Audi-- brake");
	}
	
	public void speed() {
		System.out.println("Audi-- speed");
	}

}
