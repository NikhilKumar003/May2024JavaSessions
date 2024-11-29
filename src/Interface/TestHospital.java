package Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortiesHospital fh =new FortiesHospital();
		
		fh.physioServices();
		fh.cardioServices();
		fh.dentalServices();
		fh.dermaServices();
		fh.medicalTraining();
		fh.pathologyServices();

		fh.emergencyServices();
//		static method can called by interface name only
		usMedical.billing();
		FortiesHospital.billing(); // method hiding
//		top casting: child class object refer by parent interface reference variable
		System.out.println("medical insurance method used default key word");
		fh.medicalInsurance();
		System.out.println("---------");
		usMedical us= new FortiesHospital();
		us.dentalServices();
		us.oncologyServices();
		us.dentalServices();
		us.emergencyServices();
		us.medicalInsurance();
		us.covidVaccination();
		System.out.println("-----------");
		ukMedical uk= new FortiesHospital();
		uk.dermaServices();
		uk.entServices();
		uk.pediaServices();
		uk.emergencyServices();
		
		
		System.out.println(usMedical.min_fee); //100
		System.out.println(FortiesHospital.min_fee);//500
//		down casting : is not allowed in interface, since its throw error in compile time
		System.out.println("----------");
		
		fh.covidVaccination();
		System.out.println("----------");
		
		fh.medicalTraining();
		fh.medicalRaD();
	}

}
