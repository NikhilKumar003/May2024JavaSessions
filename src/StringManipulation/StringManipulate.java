package StringManipulation;

import java.util.Arrays;

public class StringManipulate {

	public static void main(String[] args) {

		String name ="hello hi this is new java coding for selenium practice";
		System.out.println(name.length());
		System.out.println("HI :"+ (name.length()-1));
		System.out.println(name.charAt(5));
//		System.out.println(name.charAt(49)); String index out of bound exception=SIOB
//		System.out.println(name.charAt(-1));SIOB
//		index
		System.out.println(name.indexOf('i'));// 1st occurence of i
		System.out.println(name.indexOf('i', 9));// 2nd occurence of i, but value of 9 is hard-coded
		System.out.println(name.indexOf('i', name.indexOf('i')+1));// 2nd occurence of i
		int p2= name.indexOf('i', name.indexOf('i')+1);
		System.out.println(name.indexOf('i', p2+1));
		int p3=name.indexOf('i', p2+1);
		System.out.println(name.indexOf('i', p3+1));
		
		String msg= "welcome back";
		
		if(msg.indexOf("back")==8) {
			System.out.println("iam back");
		}
		else {
			System.out.println("iam out");
		}
		
		//trim
		String trm= "java code CAPITAL";
		String trm1= "JAVA code CAPital ";
		System.out.println(trm.trim());
//		replace
		String rpls= "22-09-2023";
		System.out.println(rpls.replace('-', '/'));
//		lower & upper case
		System.out.println(trm.toLowerCase());
		System.out.println(trm.toUpperCase());
//		contains
		System.out.println(trm.contains("code"));
		
		if(trm.contains("java")) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		System.out.println("--------");
		System.out.println(trm.equalsIgnoreCase(trm1.trim()));
		
		String code= "JAVA_PYTHON_JAVASCRIPT_RUBY";
		
		String ark[]= code.split("_");
		System.out.println(ark.length-1);
		System.out.println(Arrays.toString(ark));
		try {
			System.out.println(ark[ark.length]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception catched");		
			}
		
		System.out.println(ark[ark.length-1]);
		
	}
	


}
