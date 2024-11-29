package practice01;

public class EvenOddwithSwitch {

	public static void main(String[] args) {

		char ch = 'a';
		for (; ch <= 'z'; ch++)
//			System.out.println("small alphabets");
		{
			System.out.println(ch + " =" + (byte) ch);

		}
		System.out.println("------------");
		char ch1 = 'A';
		for (; ch1 <= 'Z'; ch1++) {
			System.out.println(ch1 + " =" + (byte) ch1);
		}
		System.out.println("--------");

		char ch2 = '!';
		while (ch2 <= 'd') {
			System.out.println((byte)ch2);
			ch2++;
		}

	}

}
