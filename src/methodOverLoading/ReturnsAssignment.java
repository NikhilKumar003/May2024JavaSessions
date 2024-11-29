package methodOverLoading;

public class ReturnsAssignment {
// without parameter without return
	public void printHello() {
		System.out.println("Hello world");
	}
//	with parameter with return
	public int add(int a, int b) {
		int c =a +b;
		return c;
		
	}
	public boolean campare(String a, String b) {
		if(a.equals(b)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static double average(double[] a) {
		double sum=0.0;
		double n= a.length;
		for (int i=0;i<n;i++) {
			sum =sum +a[i];
		}
		return sum/n;
	}
	
	public static void main(String[] args) {

		ReturnsAssignment p1 =new ReturnsAssignment();
		p1.printHello();
		int d= p1.add(23, 32);
		System.out.println(d);
		boolean flag= p1.campare("Hello", "Hello");
		System.out.println(flag);
		double l[]= {1.2,2.3,4.3,5.4,5.7};
		double dl= average(l);
		System.out.println(dl);
	}

}
