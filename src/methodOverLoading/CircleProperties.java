package methodOverLoading;

// give the radius of circle ,& get area, circumference
public class CircleProperties {

//	static double pi =Math.PI;
	public static  double e1(int radius) {
		
//		System.out.println(pi);
		double area = Math.PI *radius* radius;
		return area;
	}
	public  static double e2(int radius) {
//		circumference
		 double circum = 2* Math.PI* radius;
		return circum;
	}
	
	public static void main(String[] args) {
		
//		CircleProperties cp= new CircleProperties();
		  CircleProperties.e1(7);
		double ar1= CircleProperties.e1(7);
		System.out.println(ar1);
		double circumfer = CircleProperties.e2(7);
		System.out.println(circumfer);
	}

}
