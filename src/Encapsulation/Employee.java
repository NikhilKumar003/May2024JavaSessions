package Encapsulation;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private boolean isPrem;

	// public constructor also acting as "setter"	
		public Employee(String name, int age, double salary, boolean isPrem) {
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.isPrem = isPrem;
		}
// Creating getter & setter in public,so this name can use other class
//	public getter/setter
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return this.age;
	}
//	setter will also act as updating the details (put method-api)
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPrem() {
		return isPrem;
	}
	public void setPrem(boolean isPrem) {
		this.isPrem = isPrem;
	}
}
