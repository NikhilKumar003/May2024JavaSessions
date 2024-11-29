package constructors;

public class Car {
	String name;
	String color;
	double price;
	String chasisNum;
	String model;
	

	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	


	public Car(String name, String color, double price, String chasisNum, String model) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.chasisNum = chasisNum;
		this.model = model;
	}



	public Car(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}



	public static void main(String[] args) {

		Car c1=new Car("BMW", 343.78);
		Car c2=new Car("AUDI", "Black", 34.78);
		Car c3=new Car("Bently", "Red", 45.78, "NIK768", "Q7");
		
		System.out.println(c1.name+" "+c1.color+" "+c1.price+" "+c1.chasisNum+" "+c1.model);
		System.out.println(c2.name+" "+c2.color+" "+c2.price+" "+c2.chasisNum+" "+c2.model);
		System.out.println(c3.name+" "+c3.color+" "+c3.price+" "+c3.chasisNum+" "+c3.model);
	}

}
