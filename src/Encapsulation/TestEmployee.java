package Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {

//		Employee obj =new Employee();
//		obj.setName("ENK");
//		String n= obj.getName();
//		System.out.println(n);
		
//		create {post method}
		Employee obj =new Employee("Nikhi", 28, 26, true);
		
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.isPrem());
//		put method
		obj.setSalary(35.3);
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.isPrem());
//		create
		Employee obj1 =new Employee("pankaj", 26, 36, true);
		
		System.out.println(obj1.getName()+" "+obj1.getAge()+" "+obj1.getSalary()+" "+obj1.isPrem());
//		browser
		Browser br= new Browser();
		br.launchBrowser();
//		login
		LoginPage lp1 =new LoginPage("navin@game.in","pass@1234");
		lp1.loginPortal();
		
		
//		lp1.setUsername("naveen234@game.in");
//		lp1.setPassword("pass@1234");
//		lp1.loginPortal();
	}

}
