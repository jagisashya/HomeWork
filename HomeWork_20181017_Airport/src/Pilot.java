
public class Pilot extends Employee {
	
	private String misparPilotLicense;
	
	public Pilot(String firstName, String lastName,float experience, String misparPilotLicense) {
		super(firstName, lastName, "Pilot", experience);
		this.misparPilotLicense = misparPilotLicense;
	}

	@Override
	public void print () {
		super.print();
		System.out.println("Pilot License ==> " + misparPilotLicense);
	}

}
