package constructors;

public class Rectangle {

	double len;
	double wid;
	
	public Rectangle() {
		System.out.println(len);
		System.out.println(wid);
	}
	

	public Rectangle(double len, double wid) {
		super();
		this.len = len;
		this.wid = wid;
	}

	public static double rec(double len, double wid) {
		double ar = len * wid;
		return ar;
	}

	public static void main(String[] args) {
		double ar1= Rectangle.rec(20, 30);
		System.out.println(ar1);
		double ar2= Rectangle.rec(24, 24);
		System.out.println(ar2);
	}

}
