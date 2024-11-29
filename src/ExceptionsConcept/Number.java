package ExceptionsConcept;

public class Number {

	public static  int div(int a, int b) {
		try {
			int c= a/b;
			return c;	
		}
		catch(ArithmeticException e){
			System.out.println("catch the flow");
			return -1;
		}
	
	}
	public static void main(String[] args) {

		int d= div(10, 0);
		System.out.println(d);
		System.out.println("print the mark sheet");
	}

}
