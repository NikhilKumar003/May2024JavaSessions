package practice01;

public class Multiplication {

	public static void main(String[] args) {
		
		
		int k;
		for(int i=1;i<=10;i++) {
			k=9*i;
			System.out.println(9+" * "+i+" ="+k);
		}
		System.out.println("-----------");
		int j=0;
		for(;j<=10;j++) {
			System.out.println(j);
			if(j==7) {
				System.out.println("break the loop");
				break;
			}
		}
		
	}

}
