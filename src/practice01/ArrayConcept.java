package practice01;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		
		a[0]= 100;
		a[1]= 110;
		a[2]= 120;
		a[3]= 130;
		System.out.println(Arrays.toString(a));
//		a[5]= 200; //AIOB
		System.out.println(a.length);
		System.out.println("------------");
		int i=0;
		for(i=0;i<a.length;i++) {
		System.out.println(a[i]);
		a[2]=121;
		System.out.println(a[i]);
		}	
	}

}
