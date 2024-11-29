package objectAssignments;

public class MethodChaining {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
    public void m2() {
		System.out.println("m2 method");
		m3();
	}
    public void m3() {
		System.out.println("m3 method");
		m1();
	}
    public void m4() {
    	System.out.println("m4 method");
    	
    }
    public static void t1() {
		System.out.println("t1 method");
		t2();
		
	}
    public static void t2() {
		System.out.println("t2 method");
		t3();
	}
    public static void t3() {
		System.out.println("t3 method");
		MethodChaining obj1= new MethodChaining();// but one more object is creating, so overcome this we need to use 
//		call by reference;
		obj1.m4();
	}
	public static void main(String[] args) {
		MethodChaining obj = new MethodChaining();
		
		obj.m1();
		t1();
		
	}

}
