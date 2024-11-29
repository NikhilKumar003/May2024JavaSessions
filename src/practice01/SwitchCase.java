package practice01;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "ie";
		switch (browser) {
		case "chrome": {
			System.out.println("chrome is launched");
			break;
		}
		case "firefox": {
			System.out.println("firefox is launched");
			break;
		}
		case "edge": {
			System.out.println("edge is launched");
		}
		case "ie": {
			System.out.println("ie is launched");
		}
		
		default:
			System.out.println("plz pass valid browser : "+ browser);
		}

	}

}
