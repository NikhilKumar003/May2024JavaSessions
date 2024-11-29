package practice01;

public class Vowels {

	public static void main(String[] args) {
		char ch='a';
		System.out.println("vowels are :");
		for(;ch<='z';ch++) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.print(ch);
			}
		}
		System.out.println("----------");
		char ch1='a';
		System.out.println("vowls are :");
		while(ch1<='z') {
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') {
				System.out.print(ch1);	
				}
			ch1++;
	}
}
}