
public class FlightAttendant extends Attendant {
	

	public FlightAttendant(String firstName, String lastName, float experience, String originCountry,
			String workType) {
		super(firstName, lastName, "Fly Attendant" , experience, originCountry, workType);
		
		// TODO Auto-generated constructor stub
	}

	public void setWorkType(String flyClass) {
		if (flyClass != "ראשונה" && flyClass != "עסקים" && flyClass != "אקונומי" ) 
			super.workType = "error";
		else
			super.workType = flyClass;
	}

	@Override
	public void print () {
		super.print();
		System.out.println("Class type        ==> " + workType);
		
	}

}
