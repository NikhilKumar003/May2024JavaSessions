package arrayLists;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(20);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		ar.remove(0);
		System.out.println(ar.get(0));
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		System.out.println(ar);
		
		ArrayList<Object> ar1 = new ArrayList<Object>();
		ar1.add("String god");
		ar1.add(459.00);
		ar1.add(true);		
		System.out.println(ar1);
		
	}
	

}
