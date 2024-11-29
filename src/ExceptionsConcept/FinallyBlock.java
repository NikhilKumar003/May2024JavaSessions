package ExceptionsConcept;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("aa");
		
		try {
			int i=9/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("AE is catched here");
		}
		finally {
			System.out.println("AE is also catched here");
		}
		System.out.println("-----======-------");
	
		try {
			int j=2/0;
		} finally {
			System.out.println("used only finally without catch block");
		}
	}
	
}
