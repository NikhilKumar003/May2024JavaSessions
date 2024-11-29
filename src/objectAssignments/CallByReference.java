package objectAssignments;

public class CallByReference {
	
	String name;
	int age;
	public void m1(int a)
	{
		System.out.println(a);
	}
	public static void t1(CallByReference p1) {
		p1.m1(20);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
	}
	public static void main(String[] args) {

		CallByReference obj =new CallByReference();
		obj.name= "nikhil";
		obj.age=28;
		obj.m1(20);
		CallByReference.t1(obj);
	}

}
