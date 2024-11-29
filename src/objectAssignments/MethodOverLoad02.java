package objectAssignments;

public class MethodOverLoad02 {
// static method concepts
	public void getMail() {
		System.out.println("get mail");
	}
	
	public static void sentMail() {
		System.out.println("sent mail");
	}
	
	public static void main(String[] args) {

		MethodOverLoad02 obj = new MethodOverLoad02();
		obj.getMail();
//		obj.sentMail(); This method is static in nature, no need to call with object name
//		call directly with method name or else use class name
		sentMail(); 
		MethodOverLoad02.sentMail();
	}

}
