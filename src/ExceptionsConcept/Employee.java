package ExceptionsConcept;

public class Employee {

	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
		Employee e1 =new Employee();
		e1=null;
		e1.name= "nikhil";
			int i=9/0;			
		}
		catch (NullPointerException e) {
			System.out.println("Its NPE....");
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("Its AE....");
			e.printStackTrace();
		}
		catch (Throwable e) { // but its a bad practice
			System.out.println("some exception is coming  globally");
			e.printStackTrace();
		}
		
		
		
		System.out.println("bye");
	}

}
