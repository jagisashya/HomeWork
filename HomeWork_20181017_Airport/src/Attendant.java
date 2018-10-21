
public abstract class Attendant extends Employee {
	
	
	public String originCountry;
	public String workType;
	
	
	
	public Attendant(String firstName, String lastName,String function, float experience, String originCountry,
			String workType) {
		super(firstName, lastName, function, experience);
		this.originCountry = originCountry;
		this.workType = workType;
		 
	}
	public abstract void setWorkType (String worktype);

	@Override
	public void print () {
		super.print();
		System.out.println("Country of Origin ==> " + originCountry);
				
	}

}
