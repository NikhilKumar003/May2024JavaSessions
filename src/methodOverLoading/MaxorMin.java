package methodOverLoading;

public class MaxorMin {

	public void max(int a, int b, int c) {
		if(a>b&&a>c) {
			System.out.println("a is grater");
		}
		else if(b>c&&b>a) {
			System.out.println("b is greater");
		}
		else if(c>a&&c>b) {
			System.out.println("c is greater");
		}
//		System.out.println("the max number is:"+  );
		
	}
	public void min(int a, int b, int c) {
//		System.out.println("the min number is:"+ b );
		if(a<b&&a<c) {
			System.out.println("a is smaller");
		}
		else if(b<c&&b<a) {
			System.out.println("b is smaller");
		}
		else if(c<a&&c<b) {
			System.out.println("c is smaller");
		}
	}
	
	public static void main(String[] args) {
	
		MaxorMin m1= new MaxorMin();
		m1.max(100, 20, 30);
		
		m1.min(100, 20, 30);		
		
	}

}
