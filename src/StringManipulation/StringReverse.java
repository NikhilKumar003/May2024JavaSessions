package StringManipulation;


public class StringReverse {

	public static String reverse(String str) {
		
		if(str==null) {
			throw new RuntimeException("VALUE CANNOT BE NULL");
		}
		
		if(str.length()==1) {
			return str;
		}
				
		int len=str.length();
		String rev ="";
		for(int i=len-1;i>=0;i--) {
			rev= rev+ str.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
//		String st1= "selenium";
		String reversal= reverse("selenium");
		System.out.println(reversal);
		String reversal1= reverse("d");
		System.out.println(reversal1);
		
		System.out.println(reverse(" Y G "));
//		System.out.println(reverse(null));
		System.out.println("1234");
		System.out.println(" ");
		System.out.println("null");
		System.out.println(" Testing");
	}

}
