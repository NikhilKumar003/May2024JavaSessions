package objectAssignments;

public class Book {

	String title;
	String author;
	int pageCount;
	
	public static void main(String[] args) {
		
		int totalBooks=0;
		Book b1= new Book();
		b1.title= "ClassMate";
		b1.author="camaroon";
		b1.pageCount=232;
		totalBooks++;
		
		Book b2= new Book();
		b2.title= "Nirmala";
		b2.author="Ramoji";
		b2.pageCount=332;
		totalBooks++;
		
		Book b3= new Book();
		b3.title= "spiral";
		b3.author="xerox";
		b3.pageCount=432;
		totalBooks++;
		
		System.out.println(b1.title+" "+b1.author+" "+b1.pageCount);
		System.out.println(b2.title+" "+b2.author+" "+b2.pageCount);
		System.out.println(b3.title+" "+b3.author+" "+b3.pageCount);
		System.out.println(totalBooks);
		b2.pageCount=456;
		System.out.println("modified page count:"+b2.pageCount);
		
		Book b4= new Book();
		b4.title= "spiral";
		b4.author="xerox";
		b4.pageCount=432;
		totalBooks++;
		System.out.println(b4.title+" "+b4.author+" "+b4.pageCount);
		System.out.println(totalBooks);
	}

}
