package methodOverLoading;

// requirement is give 2 numbers & get the multiplication of it

public class Multiplication {
	
	public void d1(int a, int b) {
		int c= a * b;
		System.out.println("multiply of 2 numbers:" + c);
	}
	
	public  void d1(double a, double b, double d) {
		double c= a * b* d;
		System.out.println("multiply of 3 numbers:" + c);
	}

	public static void d1(String surname, String name) {
		String c= surname+" "+ name;
		System.out.println("Concat of 2 strings:" + c);
	}
	
	public static void main(String[] args) {

		Multiplication m1 =new Multiplication();
		m1.d1(19, 34);
		m1.d1(23, 40, 56);
		Multiplication.d1("Enabothula", "Nikhil");
	}

}
