package constructors;

public class Person {
	
	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {

		Person p1= new Person("nikhil", 28,'M',5.4);
		
		System.out.println(p1.name+" "+p1.age+" "+p1.gender+" "+p1.height);
		
		Person p2= new Person("vasu", 24, 'M', 5.9);

		System.out.println(p2.name+" "+p2.age+" "+p2.gender+" "+p2.height);

	}

}
