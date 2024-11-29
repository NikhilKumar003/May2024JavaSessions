package methodOverLoading;

public class EvenorOdd {

	public boolean num(int a) {
			
		if(a%2==0) {
			boolean flag =true;
			return flag;
		}
		else {
			boolean flag=false;
			return flag;
		}
	}
	
	public static void main(String[] args) {

		EvenorOdd obj= new EvenorOdd();
		boolean fg=obj.num(45);
		System.out.println(fg);
	}

}
