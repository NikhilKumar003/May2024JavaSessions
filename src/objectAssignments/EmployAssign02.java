package objectAssignments;

public class EmployAssign02 {

	String name;
	int age;
	double salary;
	
	
	public static void main(String[] args) {
		double totalSalary=0;
		EmployAssign02 e1= new EmployAssign02();
		e1.name="tom";
		e1.age=21;
		e1.salary=10;
		totalSalary=totalSalary+e1.salary;
		
		EmployAssign02 e2= new EmployAssign02();
		e2.name="jerry";
		e2.age=21;
		e2.salary=20;
		totalSalary=totalSalary+e2.salary;
		
		EmployAssign02 e3= new EmployAssign02();
		e3.name="bob";
		e3.age=21;
		e3.salary=40;
		totalSalary=totalSalary+e3.salary;
		
		System.out.println(e1.name+" "+e1.age+" "+ e1.salary);
		System.out.println(e2.name+" "+e2.age+" "+ e2.salary);
		System.out.println(e3.name+" "+e3.age+" "+ e3.salary);
		System.out.println(totalSalary);
//		salary for e3 updated
		e3.salary=50;
//		totalSalary=totalSalary+e3.salary;
		System.out.println("total salary after increment:");
		System.out.println(e1.salary+e2.salary+e3.salary);
		
		EmployAssign02 e4= new EmployAssign02();
		e4.name="god";
		e4.age=21;
		e4.salary=55;
		totalSalary=totalSalary+e4.salary;
		System.out.println(e4.name+" "+e4.age+" "+ e4.salary);
		System.out.println("total salary after student added:");
		System.out.println(e1.salary+e2.salary+e3.salary+e4.salary);

	}

}
