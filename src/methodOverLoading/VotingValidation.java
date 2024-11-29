package methodOverLoading;

public class VotingValidation {

	public boolean v1(int a) {
		boolean flag;
		if(a>=18) {
			flag =true;
			return flag;
		}
		else {
			flag =false;
			return flag;
		}
	}
	
	public static void main(String[] args) {
		
		VotingValidation vv= new VotingValidation();
		boolean fg= vv.v1(17);
		System.out.println(fg);
	}

}
