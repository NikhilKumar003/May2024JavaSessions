package objectAssignments;

public class ObjectsAssign01 {

	String name;
	int age;
	boolean married;
	public static void main(String[] args) {

		int totalStudents=0;
		ObjectsAssign01 c1= new ObjectsAssign01();
		c1.name="nikhil";
		c1.age=28;
		c1.married=false;
		totalStudents++;
		System.out.println(c1.name+" "+c1.age+" "+ "count: "+totalStudents);
		ObjectsAssign01 c2= new ObjectsAssign01();
		c2.name="venu";
		c2.age=29;
		c2.married=false;
		totalStudents++;
		System.out.println(c2.name+" "+c2.age+" "+ "count: "+totalStudents);
		c2.age=30;
		System.out.println(c2.name+" "+c2.age+" "+ "count: "+totalStudents);
		
		ObjectsAssign01 c3= new ObjectsAssign01();
		c3.name="venky";
		c3.age=28;
		c3.married=true;
		
		boolean match=c3.married;
		
		totalStudents++;
		System.out.println(c3.name+" "+c3.age+" "+ "count: "+totalStudents);
		
		if(match!=true) {
			System.out.println("not engaged" );
		}
		else {
			System.out.println("engaged");
		}
		
	}

}
