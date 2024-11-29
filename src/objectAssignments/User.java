package objectAssignments;

public class User {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		User u1 =new User();
		u1.name="nikhil";
		u1.age=28;
		u1.city="wgl";
		
		User u2 =new User();
		u2.name="hari";
		u2.age=23;
		u2.city="cdph";
		
		User u3= new User();
		u3.name="vasu";
		u3.age=23;
		u3.city="nlr";
		
		User u4= new User();
		u4.name="krishna";
		u4.age=26;
		u4.city="hyd";
		
		System.out.println(u1.name+" "+ u1.age+" "+u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+u3.city);
		
		System.out.println("-------");
		u1=u2;
		System.out.println(u1.name+" "+ u1.age+" "+u1.city);
		u2=u3;
		System.out.println(u2.name+" "+ u2.age+" "+u2.city);
		u3=u4;
		System.out.println(u3.name+" "+ u3.age+" "+u3.city);
		u4=u1;
		System.out.println(u4.name+" "+ u4.age+" "+u4.city);
		
	}

}
