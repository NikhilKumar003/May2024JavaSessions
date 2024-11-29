package methodOverLoading;

import java.util.Arrays;

public class ReverseObjectArrays {

	public static Object reverseArray(Object[] array) {
		
		int len= array.length;
		Object[] obj = new Object[len];
		int count =0;
		for (int i=len-1;i>=0;i--) 
		{
			obj[count]= array[i];
			count++;
		}
		return obj;
	}
	
	
	public static void main(String[] args) {

		Object[] orginal = {3,5,6,8,9,34,90};
		Object[] obj =(Object[]) reverseArray(orginal);
		System.out.println(Arrays.toString(obj));
	}

}
