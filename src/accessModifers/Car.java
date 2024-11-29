package accessModifers;

public class Car {

	String name;
	public int price;
	protected String colour;
	private  String chasNum;
	
	public static void main(String[] args) {

		Car c= new Car();
		c.chasNum="123890";
		c.colour="blue";
		c.price=909;
		c.name= "BMW";
	}

}
