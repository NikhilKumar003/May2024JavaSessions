package ExceptionsConcept;

public class FinallyKeyword {

	public int mq (String name) {
		
		int marks;
//		String name = null;
		
		if(name.equals("Nikhil")) {
			
			try {
				int i=9/0;	
				return 90;
			}
			catch (ArithmeticException e) {
			System.out.println("AE is coming");		
			}
			finally {
			
				try {
					return 59;
				} catch (Exception e2) {
					System.out.println("inside final block");
				}
			}
			
			
		}
		if(name.equals("venu")) {
			return 78;
		}
		return -1;
	}
	public static void main (String args[]) {
		
		FinallyKeyword fk= new FinallyKeyword();
		int k= fk.mq("Nikhil");
		System.out.println(k);
		
	}
}
