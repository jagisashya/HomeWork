import java.util.ArrayList;

public class SuitCase {
	
// ---------- A t r i b u t s ----------
	private ArrayList<Product> listProduct;
	private int suitCaseWeight=0;
	
	
// ---------- Constructor ----------
	
	public SuitCase() {
		listProduct = new ArrayList<Product>();
//		addProducts(product);
//		this.listProduct = listProduct;
//		this.suitCaseWeight = suitCaseWeight;
	}
	
	public int getSuitCaseWeight() {
		return this.suitCaseWeight;
	}
	
	public ArrayList<Product> getListProduct() {
		return listProduct;
		
		
// ---------- M e t h o d o s ----------
		
	}

	public void addProducts (Product product) {
		listProduct.add(product);
	//	System.out.println(listProduct.size());
		this.suitCaseWeight += this.listProduct.get(listProduct.size()-1).getWeight();
	}

	public boolean removeProducts (int index) {
		if (index <= listProduct.size() && index >= 0) {
			this.suitCaseWeight -= this.listProduct.get(index-1).getWeight();
			listProduct.remove(index-1);
			return true;
		} else
			return false;
	}
		
	@Override
	public String toString() {
		String s = "\n List of products and weight at the case \n\n";
		int i = 0;
		for (Product product:listProduct) 
			s += ++i + " - " + product.getProductName() + " - " + product.getWeight() + '\n';
		return s;
	}

}