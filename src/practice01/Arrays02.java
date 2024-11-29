package practice01;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		char ch[]= new char[4];
		ch[0]='a';
		ch[1]='z';
		ch[2]='A';
		ch[3]='Z';
//		ch[4]='0';
		
		for(int i=0; i<ch.length;i++) {
			System.out.println((byte)ch[i]);
		}
		
		System.out.println("------");
		
		for (char j='a';j<='z';j++) {
			System.out.println((byte)j);
		}
		System.out.println("------");
		//for each loop
		
		for(int e: ch) {
			System.out.println(e);
		}
		System.out.println("------");
		
		String st[]=new String[4];
		st[0]="Nikhil";
		st[1]="Kumar";
		st[2]="on the";
		st[3]="Flow to Java";
		
		System.out.println(Arrays.toString(st));

		for (String e: st) {
			System.out.println(e);
		}
	}

}
