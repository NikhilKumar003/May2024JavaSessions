package objectAssignments;

public class MethodOverLoading {

	public int test() {
		System.out.println("1st test");
		return 30;
	}
	public void test(int a) {
		System.out.println("2nd test");
	}
	public boolean test(String a, boolean flag) {
		System.out.println("3rd test");
		switch (a) {
		case "dravid": 
			return true;
		default:
			System.out.println("enter valid name");
			return false;
		}
		
		
	}
	public int test(int a, int b) {
		System.out.println("4rth test");
		int c= a+ b;
		return c;
		
	}
//	requirement: give color name & get country name
	public String test(String colour ) {
		System.out.println("5th test");
		if(colour.equalsIgnoreCase("blue")) {
			return "India";
		}
		else if (colour.equalsIgnoreCase("black")) {
			return "New Zealand";
		}
		else if (colour.equalsIgnoreCase("yellow")) {
			return "Australia";
		}
		else {
			System.out.println("give valid colour name:"+ colour);
			
			return "No country ";
		}
	}
//	requirement: give product, model, price &  get details of product
	public String  test(String product, String model, int price) {
		System.out.println("6th test");
		if(product.equals("lenova")||model.equals("high-z")||price==30) {
			return "2nd year";
		}
		else if (product.equals("Dell")||model.equals("high-Y")||price==20) {
			return "3rd year";
		}
		else {
			System.out.println("Student still in 1st year");
			return "1st year";
		}
		
	}
	
	public static void main(String[] args) {
		MethodOverLoading mol =new MethodOverLoading();
		String country= mol.test("yellow");
		System.out.println(country);
		String details= mol.test("lenova", "high-z", 30);
		System.out.println(details);
		int sum= mol.test(22, 39);
		System.out.println(sum);
		boolean flg= mol.test("dravid", false);
		System.out.println(flg);
	}

}
