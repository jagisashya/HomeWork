
public abstract class Person {
	private String function;
	private String firstName;
	private String lastName;
	
	public Person(String function, String firstName, String lastName) {
		this.function  = function;
		this.firstName = firstName;
		this.lastName  = lastName;
	}
	
	public String getFunction() {
		return function;
	}
	
	public String getFirstName () {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void print () {
		System.out.println("----- " + getFunction() + "-----" +
				 "\nName       ==> " + getFirstName() +
		         "\nLast Name  ==> " + getLastName());
	};

}
