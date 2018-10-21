
public class Passenger extends Person {

	private String passportNumber;

	
	public Passenger(String firstName, String lastName, String passportNumber) {
		super("Passenger", firstName, lastName);
		this.passportNumber = passportNumber;
	}


	@Override
	public void print() {
		super.print();
		System.out.println("Passport Number ==> " + passportNumber);

		
		
	}

}
