package practice01;

public class FunctionsConcept {


	public void test() {
		System.out.println("test method with no return no input");
	}
	
	public void calC() {
		System.out.println("test method with no return and no input");
		int i=90, b=30;
		int c=i+b;
		 System.out.println(c);
	}
	
	public int getNumber() {
		System.out.println("test method with return no input");
		int amount =100;
		int tax= 20;
		int total= amount + tax;
		return total;
	}
	
	public String getTrainerName() {
		System.out.println("test method with return no input");
		//String name ="Navin";
//		return name;
		return "Naveen";
	}
	public boolean isUserActive() {
		System.out.println("using boolean type with return no input");
		return true;
	}
//	with some input no return
	public void add(int a, int b) {
		int c =a + b; 
		
		System.out.println(c);
	}
//	with input and return
	public String adding(int a, String b) {
		String add= a + b;
		return add;
//		System.out.println(add);
		
//		give input as integer and get string (marks sheet)
	}
	public int markSheet(String name) {
		if(name.equalsIgnoreCase("Nikhil")){
			return 90;
		}
		else if(name.equalsIgnoreCase("hari")) {
			return 93;
		}
		else if(name.equalsIgnoreCase("Vasu")) {
			return 11;
		}
		else {
			System.out.println("please pass correct name");
			return -1;
		}
//		return marks;
	}

	
	
	public static void main(String[] args) {
		
		FunctionsConcept fc =new FunctionsConcept();
			
		fc.test();
		 fc.calC();
		 int dd= fc.getNumber();
		 System.out.println(dd);
		 String name=  fc.getTrainerName();
		 System.out.println(name);
		 boolean flag= fc.isUserActive();
		 if(flag!=true) {
			 System.out.println("this is correct");
		 }
		 else {
			 System.out.println("this is invalid");
		 }
		 
		 fc.add(20, 20);
		 String bid= fc.adding(20, "nikhil");
		 System.out.println(bid);
		int markss= fc.markSheet("malik");
		 System.out.println(markss);
	}

}
