package StringManipulation;

import java.util.Arrays;

public class StringSentenceReverse {

	public static String sentenceReverse(String str) {
		
		String rev= "";
		int len= str.length();
		for(int i=len-1;i>=0;i--) {
			rev= rev + str.charAt(i);
		}
		return rev;
	}
	
	public static String wordReverse(String str1) {
		String t1[]=str1.split("_");
//		System.out.println(t1[0]);
		String first= t1[0];
		String rev1="";
		int len1 = first.length();
		for(int i=len1-1;i>=0;i--) {
			rev1 = rev1 + first.charAt(i);
		}
		return rev1;
		
	}
	
	public static String wordReverse2(String str1) {
		String t1[]=str1.split("_");
//		System.out.println(t1[1]);
		String first= t1[1];
		String rev1="";
		int len1 = first.length();
		for(int i=len1-1;i>=0;i--) {
			rev1 = rev1 + first.charAt(i);
		}
		return rev1;
		
	}
	
	public static String entireSentense(String str1) {
		String t1[]= str1.split("_");
		String a= Arrays.toString(t1);
		String first= t1[0];
		
		int len1 = first.length();
		int lenb= a.length();
		String rev4= "";
		for(int j=lenb-1;j>=0;j--) {
			String rev1="";
			for(int i=len1-1;i>=0;i--) {
				
				rev1 = rev1 + first.charAt(i);
			}
			rev4= rev4 + rev1;
		}
		return rev4;
	}
	
	public static void main(String[] args) {
		
		String sentense ="JAVA_PYTHON_JAVASCRIPT_RUBY";
		
		System.out.println(sentenceReverse(sentense));
		
		System.out.println(wordReverse(sentense));
		System.out.println(wordReverse2(sentense));
		System.out.println(entireSentense(sentense));
	}
}
