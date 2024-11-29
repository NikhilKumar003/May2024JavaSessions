package practice01;

public class LoopsConcept {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i=i+2) {
			System.out.println("Ima Batman" +" "+i );
			i++;
		}
		
		System.out.println("--------first--------");
		
		int k=0;
		while(k<=20) {
			System.out.println(k);
			k=k++;
		}
		System.out.println("-------second-------");
		
		int l=0;
		while(l<=50) {
			System.out.println(l);
			l++;
			if(l==5) {
				System.out.println("bye");
				break;
				
			}
			
		}

	}

	
}
