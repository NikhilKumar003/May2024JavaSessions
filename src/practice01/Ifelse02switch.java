package practice01;

public class Ifelse02switch {
	public static void main(String[] args) {
		
		String browser ="chrome";
		if(browser.equals("chrome")) {
			System.out.println("chrome is launched");
		}
		if(browser.equals("firefox")) {
			System.out.println("firefox is launched");
		}
		if(browser.equals("edge")) {
			System.out.println("edge is launched");
		}
		if(browser.equals("ie")) {
			System.out.println("ie is launched");
		}
		else {
			System.out.println("plz pass valid browser"+ browser);
		}
	}

}
