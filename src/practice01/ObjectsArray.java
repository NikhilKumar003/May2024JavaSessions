package practice01;

import java.util.Arrays;

public class ObjectsArray {
	public static void main(String[] args) {
		
		Object obj[]= new Object[4];
		
		obj[0]="Nikhil";
		obj[1]=28;
		obj[2]='M';
		obj[3]=9.60;
		
		System.out.println(Arrays.toString(obj));
		
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("--------");
			
			for(Object e: obj) {
				System.out.println(e);
				if(e.equals(28)) {
					System.out.println("This value is age:"+ e);
				}
			}
			System.out.println("--------");
			//reverse order
			int a[]=new int[5];
			a[0]=10;
			a[1]=20;
			a[2]=30;
			a[3]=40;
			a[4]=50;
			
			for (int k=a.length-1;k>=0;k--) {
				System.out.println(a[k]);
			}
			System.out.println("--------");
			int count=a.length-1;
		
			for (int e: a) {
				e= count;
				System.out.println(a[e]);
				count--;
			}
			
			System.out.println("--------");
			
			//Array literals
			
			int i[]= {20,30,40,50};
			System.out.println(i[2]);
//			System.out.println(i[6]);
		}
	}

