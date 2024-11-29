package practice01;

public class IfelseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=200, b=30, c=40, d=50, e=70, f=90;
		if(a>b) {
			System.out.println("a is greater");
			if(c<d) {
				System.out.println("d is greater");
				if(e<f) {
					System.out.println("f is greater");
				}
			}
			
		}
		else {
			System.out.println("b is greater");
		}
	}

}
