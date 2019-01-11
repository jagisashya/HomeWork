package javaBeanClasses;

public class CustomerVsCoupon {
	private  int Customer_Id;
	private int Coupon_Id;
	
	public CustomerVsCoupon(int customer_Id, int coupon_Id) {
		super();
		Customer_Id = customer_Id;
		Coupon_Id = coupon_Id;
	}
	
	public int getCustomer_Id() {
		return Customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}

	public int getCoupon_Id() {
		return Coupon_Id;
	}

	public void setCoupon_Id(int coupon_Id) {
		Coupon_Id = coupon_Id;
	}

	@Override
	public String toString() {
		return "CustomerVsCoupon [Coupon_Id=" + Coupon_Id + ", Customer_Id=" + Customer_Id + "]";
	}
	
	
	
	
}
