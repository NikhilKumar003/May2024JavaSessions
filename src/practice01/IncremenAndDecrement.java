package practice01;

public class IncremenAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=11;
		i= i++ + ++i;
		System.out.println(i);

		System.out.println("--------------------");
		int a=11, b=11, c;
		
		c= a+b+ a++ + b++ + ++a + ++b;
		System.out.println(a);
		System.out.println(b); 
		System.out.println(c);
		System.out.println("--------------------");
		int i1=0;
		i1= i1++ - --i1 + ++i1 - i1--;
		System.out.println(i1);
		System.out.println("--------------------");
		int vb=1, vc=2;
		System.out.println(--vc - ++vb + ++vc - --vb);
//		int vd =--(vb++);
		char gg= 'A';
		System.out.println((int)++gg);

	

}
}