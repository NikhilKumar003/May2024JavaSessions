 package BullderPattern;

public class Application {
	
	public Application login() {
		System.out.println("login to app");
		return this;
	}
	public Application login(String username, String password ) {
		System.out.println("login to app"+username+" "+password);
		return this;
	}

	public Application search(String Productname ) {
		System.out.println("search the product name");
		return this;
	}
	public Application search(String Productname, int price ) {
		System.out.println("search the product name"+ Productname);
		return this;
	}
	public Application addToCart(String Productname ) {
		System.out.println("search the product name");
		return this;
	}
	public Application doPay(String upi) {
		System.out.println("enter upi"+ upi);
		return this;
	}
	public Application doPay(String cc,int cvv) {
		System.out.println("enter credit card & cvv"+ cc + cvv);
		return this;
	}
	public Application generateOrder() {
		System.out.println("pls generate order");
		return this;
	}
	public Application logout() {
		System.out.println("Logout from application");
		return this;
	}
}

