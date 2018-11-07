
public class Product {
	
	private int weight;
	private String productName;
	
	
	public Product(int weight, String productName) {
		this.weight = (weight > 0)?weight:0 ;
		this.productName = productName ;
	}
	
// ------------------------ G e t t e r s      S e t t e r s ------------------------
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
// ----------------------------- M e t h o d s --------------------------

	@Override
	public String toString() {
		return getProductName() + " - " + getWeight();
	}

}
