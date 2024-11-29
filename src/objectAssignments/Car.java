package objectAssignments;

public class Car {
	
	String name;
	int price;
	String model;
	static final int wheels= 4;
	 
	 
	public static void main(String[] args) {
		
		Car c1 =new Car();
		c1.name="BMW";
		c1.price=20;
		c1.model="Z6";
		
		Car c2= new Car();
		c2.name="AUDI";
		c2.price=23;
		c2.model="X6";
		
		Car c3= new Car();
		c3.name="Volvo";
		c3.price=24;
		c3.model="V6";
		
		Car c4= new Car();
		c4.name="Tata";
		c4.price=25;
		c4.model="T6";
		
		c1=c2;
		c2=c3;
		c3=c4;
		c4=c1;
		
		
//		Car.wheels =6;
//		System.out.println(wheels);
		
		System.out.println(c1.name+" "+c1.price+" "+c1.model+" "+Car.wheels);
		System.out.println(c2.name+" "+c2.price+" "+c2.model+" "+Car.wheels);
		System.out.println(c3.name+" "+c3.price+" "+c3.model+" "+Car.wheels);
		System.out.println(c4.name+" "+c4.price+" "+c4.model+" "+Car.wheels);
		
		System.out.println(ObjectCreation.id);
		
	}

}
