package practice01;

public class BothOddEvenNums {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("This are even numbers");
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

		System.out.println("------------");

		int j = 0;
		System.out.println("This are odd numbers");
		while (j <= 100) {
			if(j%2==1) {
			System.out.println(j);
			}
			j++;
		}
		System.out.println("------------");
		for(int k=0;k<=100;k++) {
			if(k%2==0) {
				System.out.println(k);
			}
			
			else{
				System.out.println(k);
			}
			k++;
		}
		
	}

}
