package Inheritance;

public class TestCar {

	public static void main(String[] args) {

		Bmw br =new Bmw();
		br.start(); //override
		br.AutoParking();//Individual
		br.brake();//override
		br.stop();//inherited
		
		System.out.println("---------");
		Car c=new Car();
		int KeyNo= c.keys();
		c.start();
		c.refuel();
		c.brake();
		c.stop();
		Car.billing();
		
		System.out.println(KeyNo);
		System.out.println("---------");
		
		Audi au= new Audi();
		au.start();
		Audi.theftSafety();
		au.speed();
		System.out.println("--------");
//		Top-Casting
		Car c1= new Bmw();
		c1.start();
		c1.stop();
		c1.brake();
		c1.engine();
		System.out.println("-------");
//		Grand parent to child class
		br.engine();//override
		br.gearBox();//inherited
		br.ChasisNumber();
		System.out.println("--------");
		Vehicle v1= new Vehicle();
		v1.ChasisNumber();
		System.out.println("--------");
		Vehicle v2= new Car();
		v2.engine();
		System.out.println("--------");
		//compostion 
		Truck t1= new Truck();
		t1.loading();
	}

}
