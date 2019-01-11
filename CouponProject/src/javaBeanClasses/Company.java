package javaBeanClasses;

public class Company {
	private int Companie_Id;
	private String Companie_Name;
	private String Companie_Email;
	private String Companie_Password;

	public Company(String companieName, String companieEmail, String companiePassword)
			throws Throwable {
//		setCompanie_Id(companieId);
		setCompanie_Name(companieName);
		setCompanie_Email(companieEmail);
		setCompanie_Password(companiePassword);

	}
	public Company () {}

	public int getCompanie_Id() {
		return Companie_Id;
	}

	public void setCompanie_Id(int companie_Id) {
		Companie_Id = companie_Id;
	}

	public String getCompanie_Name() {
		return Companie_Name;
	}

	public void setCompanie_Name(String companie_Name) {
		Companie_Name = companie_Name;
	}

	public String getCompanie_Email() {
		return Companie_Email;
	}

	public void setCompanie_Email(String companie_Email) throws Throwable {
		// try {
		new FieldsTests().emailTest(companie_Email);
		this.Companie_Email = companie_Email;
//		FieldsTests test = new FieldsTests();
//		test.emailTest(companie_Email);
//		} catch (Exception e) {
		// TODO: handle exception
//		}
//		finally {} 
	}
	
	public void setCompanie_Email(String companie_Email,boolean noVer) {
		this.Companie_Email = companie_Email;
	}

	public String getCompanie_Password() {
		return Companie_Password;
	}

	public void setCompanie_Password(String companie_Password) throws Exception {
		new FieldsTests().testPassword(companie_Password);

		this.Companie_Password = companie_Password;
	}
	
	public void setCompanie_Password(String companie_Password,boolean noVer) {

		this.Companie_Password = companie_Password;
	}
	
	@Override
	public String toString() {
		return "Company [Companie_Id=" + Companie_Id + ", Companie_Name=" + Companie_Name + ", Companie_Email="
				+ Companie_Email + ", Companie_Password=" + Companie_Password + "]";
	}


}
