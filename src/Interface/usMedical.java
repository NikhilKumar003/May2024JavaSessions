package Interface;


public interface usMedical extends WHO{
	
	int min_fee =100;

//	abstract methods: no method body
//	cannot create object
	public void physioServices();
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	
//	can i have method with body: yes
//	by static keyword
	public static void billing() {
		System.out.println("us medical-- Billing");
	}
//	non-static method in interface by default keyword, can be common for all child classes
	default void medicalInsurance() {
		System.out.println("us medical-- Insurance");
	}
}
