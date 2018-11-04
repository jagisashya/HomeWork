
public class Products {
	
	//-----------------properties------------------------------------
	
	private double weight;
	private String productName;
	
	
	//-----------------setters + getters------------------------------
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	//-----------------constructor--------------------------------
	
	public Products(double weight, String productName) {
		this.weight = weight;
		this.productName = productName;
	}
	
	
	
	
}
