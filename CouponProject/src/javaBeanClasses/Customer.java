package javaBeanClasses;

public class Customer {
	private  int Customer_Id;
	private  String Customer_First_Name;
	private  String Customer_Last_Name;
	private  String Customer_Email;
	private  String Customer_Password;
	public Customer(String customer_First_Name, String customer_Last_Name, String customer_Email,
			String customer_Password) {
		super();
//		Customer_Id = customer_Id;
		Customer_First_Name = customer_First_Name;
		Customer_Last_Name = customer_Last_Name;
		Customer_Email = customer_Email;
		Customer_Password = customer_Password;
	}
	public Customer () {}
	public int getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}
	public String getCustomer_First_Name() {
		return Customer_First_Name;
	}
	public void setCustomer_First_Name(String customer_First_Name) {
		Customer_First_Name = customer_First_Name;
	}
	public String getCustomer_Last_Name() {
		return Customer_Last_Name;
	}
	public void setCustomer_Last_Name(String customer_Last_Name) {
		Customer_Last_Name = customer_Last_Name;
	}
	public String getCustomer_Email() {
		return Customer_Email;
	}
	public void setCustomer_Email(String customer_Email) {
		Customer_Email = customer_Email;
	}
	public String getCustomer_Password() {
		return Customer_Password;
	}
	public void setCustomer_Password(String customer_Password) {
		Customer_Password = customer_Password;
	}
	
	@Override
	public String toString() {
		return "Customer [Customer_Id=" + Customer_Id + ", Customer_First_Name=" + Customer_First_Name
				+ ", Customer_Last_Name=" + Customer_Last_Name + ", Customer_Email=" + Customer_Email
				+ ", Customer_Password=" + Customer_Password + "]";
	}
	
	
	
}
