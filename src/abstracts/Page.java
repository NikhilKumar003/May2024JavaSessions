package abstracts;

public abstract class Page {

	public abstract void loading();
	
	public abstract void logBy();
	
	public void login() {
		System.out.println("login by user");
	}
}
