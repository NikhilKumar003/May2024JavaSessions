package methodOverLoading;

public class StringConcatination {

	public static String concat(String a[]) {
		String finil =" ";
		for (String e : a) {
			finil = finil +e;
		}
		return finil;
	}
	
	public static void main(String[] args) {

		String d[]= {"Nikhil ","Joined ","Naveen ","automation ", "labs"};
		String Total= StringConcatination.concat(d);
		System.out.println(Total);
	}

}
