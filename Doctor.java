package static_instance_local;

public class Doctor {
	    String doctorName = "Porselvi";
	    String specialization = "gynocologist";

	    static String hospitalName = "Apollo Hospital";

	    void showDetails() {
	        int patientsToday = 12;

	        System.out.println("Hospital Name : " + hospitalName);
	        System.out.println("Doctor Name : " + doctorName);
	        System.out.println("Specialization : " + specialization);
	        System.out.println("Patients Today : " + patientsToday);
	    }

	    public static void main(String[] args) {

	        Doctor d1 = new Doctor();
	        d1.showDetails();
	    }
	}
