package BullderPattern;

public class AppTest {

	public static void main(String[] args) {

//		work flow-01
		Application app= new Application();
		app.login()
		.login("nikhil.kum@efg.in", "nikl@123")
		.search("macbook")
		.search("macbook", 3500)
		.addToCart("macbook")
		.doPay("4356666", 457)
		.generateOrder()
		.logout();
		
//		work flow -02
		app.login("navan@nik.vom", "navan@33")
		.search("Nokia", 230)
		.addToCart("Nokia")
		.doPay("nikil@ybl")
		.generateOrder()
		.logout();
	}

}
