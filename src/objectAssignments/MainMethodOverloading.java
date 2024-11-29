package objectAssignments;

public class MainMethodOverloading {

	public static void main(String[] args) {

		System.out.println("hello");
		MainMethodOverloading.main(10);
	}

	public static void main(int a) {
		System.out.println("int parameter"+ a);
		MainMethodOverloading.main(10, 30);
	}
	
	public static void main(int a, int b) {
		System.out.println("int parameters" + (a+b));
	}
}
