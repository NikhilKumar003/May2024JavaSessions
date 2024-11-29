package constructors;

public class Constructor {

	String name;
	int age;
	double salary;
	boolean flag;
	
	public Constructor(String name, int age) {
		this.name= name;
		this.age= age;
	}
		
	public Constructor(String name, int age, double salary, boolean flag) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.flag = flag;
	}
	public Constructor(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}



	public static void main(String[] args) {

		Constructor obj =new Constructor("nikhil", 28);
		System.out.println(obj.name +" "+obj.age+" "+ obj.salary);
		obj.salary=35.0;
		System.out.println(obj.name +" "+obj.age+" "+ obj.salary);
		
		Constructor obj1 =new Constructor("pankaj", 27, 54.4);
		System.out.println(obj1.name+" "+" "+obj1.age+" "+obj1.salary);
		
		Constructor obj2 =new Constructor("gajanan", 30, 62, true);
		System.out.println(obj2.name+" "+" "+obj2.age+" "+obj2.salary+" "+obj2.flag);
	}

}
