package javaBeanClasses;

import java.util.Date;

public class Coupon {
	private int Coupon_Id;
	private int Coupon_Company_Id;
	private int Copuon_Category_Id;
	private String Coupon_Title;
	private String Coupon_Description;
	private Date Coupon_Start_Date;
	private Date Coupon_End_Date;
	private int Coupon_Amount;
	private float Coupon_Price;
	private String Coupon_Image;
	private Date Coupon_Inserted_Date;
	private Date Coupon_Modified_date;
	
	
	
	public Coupon(int coupon_Id, int coupon_Company_Id, int copuon_Category_Id, String coupon_Title,
			String coupon_Description, Date coupon_Start_Date, Date coupon_End_Date, int coupon_Amount,
			float coupon_Price, String coupon_Image, Date coupon_Inserted_Date, Date coupon_Modified_date) {
		super();
	//	Coupon_Id = coupon_Id;
		Coupon_Company_Id = coupon_Company_Id;
		Copuon_Category_Id = copuon_Category_Id;
		Coupon_Title = coupon_Title;
		Coupon_Description = coupon_Description;
		Coupon_Start_Date = coupon_Start_Date;
		Coupon_End_Date = coupon_End_Date;
		Coupon_Amount = coupon_Amount;
		Coupon_Price = coupon_Price;
		Coupon_Image = coupon_Image;
		Coupon_Inserted_Date = coupon_Inserted_Date;
		Coupon_Modified_date = coupon_Modified_date;
	}

	public Coupon () {} 

	public int getCoupon_Id() {
		return Coupon_Id;
	}



	public void setCoupon_Id(int coupon_Id) {
		Coupon_Id = coupon_Id;
	}



	public int getCoupon_Company_Id() {
		return Coupon_Company_Id;
	}



	public void setCoupon_Company_Id(int coupon_Company_Id) {
		Coupon_Company_Id = coupon_Company_Id;
	}



	public int getCopuon_Category_Id() {
		return Copuon_Category_Id;
	}



	public void setCopuon_Category_Id(int copuon_Category_Id) {
		Copuon_Category_Id = copuon_Category_Id;
	}



	public String getCoupon_Title() {
		return Coupon_Title;
	}



	public void setCoupon_Title(String coupon_Title) {
		Coupon_Title = coupon_Title;
	}



	public String getCoupon_Description() {
		return Coupon_Description;
	}



	public void setCoupon_Description(String coupon_Description) {
		Coupon_Description = coupon_Description;
	}



	public Date getCoupon_Start_Date() {
		return Coupon_Start_Date;
	}



	public void setCoupon_Start_Date(Date coupon_Start_Date) {
		Coupon_Start_Date = coupon_Start_Date;
	}



	public Date getCoupon_End_Date() {
		return Coupon_End_Date;
	}



	public void setCoupon_End_Date(Date coupon_End_Date) {
		Coupon_End_Date = coupon_End_Date;
	}



	public int getCoupon_Amount() {
		return Coupon_Amount;
	}



	public void setCoupon_Amount(int coupon_Amount) {
		Coupon_Amount = coupon_Amount;
	}



	public float getCoupon_Price() {
		return Coupon_Price;
	}



	public void setCoupon_Price(float coupon_Price) {
		Coupon_Price = coupon_Price;
	}



	public String getCoupon_Image() {
		return Coupon_Image;
	}



	public void setCoupon_Image(String coupon_Image) {
		Coupon_Image = coupon_Image;
	}



	public Date getCoupon_Inserted_Date() {
		return Coupon_Inserted_Date;
	}



	public void setCoupon_Inserted_Date(Date coupon_Inserted_Date) {
		Coupon_Inserted_Date = coupon_Inserted_Date;
	}



	public Date getCoupon_Modified_date() {
		return Coupon_Modified_date;
	}



	public void setCoupon_Modified_date(Date coupon_Modified_date) {
		Coupon_Modified_date = coupon_Modified_date;
	}



	@Override
	public String toString() {
		return "Coupon [Coupon_Id=" + Coupon_Id + ", Coupon_Company_Id=" + Coupon_Company_Id + ", Copuon_Category_Id="
				+ Copuon_Category_Id + ", Coupon_Title=" + Coupon_Title + ", Coupon_Description=" + Coupon_Description
				+ ", Coupon_Start_Date=" + Coupon_Start_Date + ", Coupon_End_Date=" + Coupon_End_Date
				+ ", Coupon_Amount=" + Coupon_Amount + ", Coupon_Price=" + Coupon_Price + ", Coupon_Image="
				+ Coupon_Image + ", Coupon_Inserted_Date=" + Coupon_Inserted_Date + ", Coupon_Modified_date="
				+ Coupon_Modified_date + "]";
	}
	
	
}
