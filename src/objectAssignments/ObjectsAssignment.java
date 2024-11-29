package objectAssignments;

import java.util.Arrays;

public class ObjectsAssignment {

	public static void main(String[] args) {

		Object data[] = new Object[6];
		data[0] = "Nikhil";
		data[1] = 28;
		data[2] = "SRH";
		data[3] = "29-09-1995";
		data[4] = 'M';
		data[5] = 36.88;

		Object data1[] = new Object[6];
		data1[0] = "Hari";
		data1[1] = 23;
		data1[2] = "CSK";
		data1[3] = "25-11-2001";
		data1[4] = 'M';
		data1[5] = 48.88;

		Object data2[] = new Object[6];
		data2[0] = "Vasu";
		data2[1] = 23;
		data2[2] = "RR";
		data2[3] = "19-06-2001";
		data2[4] = 'M';
		data2[5] = 56.76;

		for (Object e : data) {
			System.out.println(e);
		}
		System.out.println("----------");
		for (int i = 0; i < data1.length; i++) {
			System.out.println(data1[i]);
		}
		System.out.println("-----------");
		int j = 0;
		do {
			System.out.println(data2[j]);
			j++;

		} while (j < data2.length);

		// Array Literals
		int p[] = { 12, 32, 35, 43, 65, 54, 76, 69 };
		System.out.println("-----------");
		for (int e : p) {
			System.out.println(e);
		}
		System.out.println("-----------");
		// print in reverse order

		int count = p.length - 1;
		for (int e : p) {
			e = count;
			System.out.println(p[e]);
			count--;
		}
		System.out.println("-----------");
		
		int a[]= new int[p.length-1];
		int k=0;
		for(int i=0;i<p.length;i++) {
			if(p[i]!=43) {
				a[k]=p[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
