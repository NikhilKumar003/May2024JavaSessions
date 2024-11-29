package practice01;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		int i=0;
		do {
			i++;
			System.out.println(i);
		}
		while(i<10);
		
		System.out.println("----------");
		
		int k=10;
		do {
			k--;
			System.out.println(k);
		}
		while(k>=1);
		
		System.out.println("----------");
		
		int j=0;
		do {
			j++;
			System.out.println(j);
			if(j==98) {
				System.out.println("lucky number");
			}
		}while(j<=100);
	}

}
