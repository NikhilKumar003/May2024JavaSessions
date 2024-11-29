package Encapsulation;

public class LoginPage {
	
	private String username;
	private String password;
	
	
	
	public LoginPage(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void loginPortal() {
		System.out.println("enter username:"+ getUsername());
		System.out.println("enter password:"+ getPassword());
		System.out.println("click on login button");
		System.out.println("user reached dashbord");
	}

}
