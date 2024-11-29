package ExceptionsConcept;

public class Browser {

	public void search() {
		System.out.println("calling m1");
		cart();
	}
	public void cart() {
		System.out.println("calling m2");
		try {
			bankPayment();
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("AE is catched");
		}
		
		
	}
	public void bankPayment() throws ArithmeticException {
		System.out.println("calling m3");
//		int i=9/0;
	}
	
	public static void main(String[] args) {
		Browser b1 = new Browser();
		b1.cart();

		System.out.println("new code base");
	}

}
