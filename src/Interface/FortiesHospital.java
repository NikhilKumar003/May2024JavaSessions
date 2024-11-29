package Interface;

	
public class FortiesHospital extends Medical implements usMedical, ukMedical, indianMedical {

	static final int min_fee =500;
//	US
	@Override
	public void physioServices() {
		System.out.println("FH-- physioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH-- oncologyServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH-- dentalServices");
	}
//   UK
	@Override
	public void entServices() {
		System.out.println("FH-- entServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH-- pediaServices");
	}

	@Override
	public void dermaServices() {
		System.out.println("FH-- dermaServices");
	}
// India
	@Override
	public void cardioServices() {
		System.out.println("FH-- cardioServices");
		medicalInsurance();
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-- orthoServices");
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-- neuroServices");
	}

//	Individual
	public void medicalTraining() {
		System.out.println("FH-- medicalTraining");
	}
	
	public void pathologyServices() {
		System.out.println("FH-- pathologyServices");
	}
	
//	common
	public void emergencyServices() {
		System.out.println("FH-- EmergencyServices");
	}
//  method hiding: can call by class name	
	public static void billing() {
		System.out.println("us medical-- Billing");
	}
//	trying to override the default
	@Override 
	public void medicalInsurance() {
		System.out.println("FH medical-- Insurance");
	}

//	One more interface parent
	@Override
	public void covidVaccination() {
		System.out.println("FH -- covid vaccination");		
	}
}
