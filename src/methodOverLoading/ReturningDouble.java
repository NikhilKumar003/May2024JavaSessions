package methodOverLoading;

public class ReturningDouble {

	public double m1(double a, double b) {
		double c= a* b;
		return c;
	}
	
	public static void main(String[] args) {

		ReturningDouble d1 =new ReturningDouble();
		double d= d1.m1(1.5, 2.5);
		System.out.println(d);
		
	}

}
