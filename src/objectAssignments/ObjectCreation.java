package objectAssignments;

public class ObjectCreation {

	String name;
	int age;
	double salary;
	char gender;
	boolean isPerm;
	
	static int id =4;
	
	public static void main(String[] args) {

		ObjectCreation obj =new ObjectCreation();
		
		System.out.println(obj.name+" "+obj.age+" "+obj.salary+" "+obj.gender+" "+obj.isPerm+"//");
		
		obj.name="Nikhil";
		obj.age=28;
		obj.salary=9.60;
		obj.gender='M';
		obj.isPerm=true;
		
		System.out.println(obj.name+" "+obj.age+" "+obj.salary+" "+obj.gender+" "+obj.isPerm+"//");
		
		ObjectCreation obj1 =new ObjectCreation();
		obj1.name="Hari";
		obj1.age=23;
		obj1.salary=10.55;
		obj1.gender='M';
		obj1.isPerm=true;
		
		System.out.println(obj1.name+" "+obj1.age+" "+obj1.salary+" "+obj1.gender+" "+obj1.isPerm+"//");
		
		//no reference objects
		
		new ObjectCreation();
		
		new ObjectCreation().name="virat";
		new ObjectCreation().age=23;
		System.out.println("-------");
		System.out.println(new ObjectCreation().name="virat");
		
		ObjectCreation obj2 =new ObjectCreation();
//		obj2=null;
		obj2.name="virat";
		System.out.println(obj2.name);
		System.out.println("-------");
		
		ObjectCreation obj3;
		obj3 =new ObjectCreation();
		
		System.out.println(obj3.name="krishna");
		
		
	}

}
