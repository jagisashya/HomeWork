
public class Employee extends Person {
	
//	private String function;
	private float experience;

	public Employee(String firstName, String lastName, String function, float experience) {
		super(function,firstName, lastName);
		this.experience = experience;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Experience ==> " + experience);
	}

}
