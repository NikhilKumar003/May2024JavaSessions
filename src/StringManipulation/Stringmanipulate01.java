package StringManipulation;

public class Stringmanipulate01 {

	public static void main(String[] args) {
		
		String t1= "hello";
		String t2= "java";
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		String t3= new String("hello");
		System.out.println(t1==t3);
		System.out.println(t1.equals(t3));
		System.out.println(t1.concat(t2));
		System.out.println(t1);
		
		StringBuilder sb= new StringBuilder("javac");
		System.out.println(sb.append(t3));
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
	}

}
