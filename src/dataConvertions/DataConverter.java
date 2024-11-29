package dataConvertions;

public class DataConverter {

	public static void main(String[] args) {
//		String to int
		String wt= "100";
		System.out.println(wt+20);
		int t= Integer.parseInt(wt);
		System.out.println(t+20);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
//		String to double
		String rt= "100.56";
		Double d= Double.parseDouble(rt);
		System.out.println(d+10.456);
//		int to string
		int j=900;
		String k= String.valueOf(j);
		System.out.println(k+"909");
//		boolean to string
		Boolean flag= true;
		 String kk= String.valueOf(flag);
		System.out.println(kk+20);
//		string to boolean
		String lp="False";
		Boolean flage=Boolean.parseBoolean(lp);
		System.out.println(flage);
		if(flage) {
			System.out.println("This is passed");
		}
		else {
			System.out.println("This is failed");
		}
		
		Integer v1= 200;
		int v= v1.intValue();
		System.out.println(v+30);
		
		String rest= "i love \"java\" code and \"selenium\" automation";
		System.out.println(rest);
	}
	
	

}
