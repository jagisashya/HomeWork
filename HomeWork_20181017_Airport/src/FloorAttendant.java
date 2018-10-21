
public class FloorAttendant extends Attendant {

	public FloorAttendant(String firstName, String lastName, float experience, String originCountry, String workType) {
		super(firstName, lastName, "Floor Attendant", experience, originCountry, workType);

		// TODO Auto-generated constructor stub
	}

	@Override

	public void setWorkType(String workType) {
		super.workType = workType;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Job               ==> " + workType);

	}

}
