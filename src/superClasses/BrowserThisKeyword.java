package superClasses;

public class BrowserThisKeyword {

	String name;
	double version;
	
	public void addBrowser(String name, double version) {
		this.name=name;
		this.version= version;
		
	}
	
	public static void main(String[] args) {
		
		BrowserThisKeyword b= new BrowserThisKeyword();
		b.addBrowser("chrome", 124.56);
		System.out.println(b.name +" "+b.version );
		
	}
}
