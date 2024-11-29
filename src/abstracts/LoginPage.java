package abstracts;

public class LoginPage extends Page{

	@Override
	public void loading() {
		System.out.println("loading for 5 seconds");
	}

	@Override
	public void logBy() {
		System.out.println("log by value");
	}
	
	

}
