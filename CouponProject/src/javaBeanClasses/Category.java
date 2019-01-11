package javaBeanClasses;

public class Category {
	private int Category_Id;
	private String Category_Name;
	
	public Category(String category_Name) {
		super();
		Category_Name = category_Name;
	}
	
	public Category() {}

	public int getCategory_Id() {
		return Category_Id;
	}

	public String getCategory_Name() {
		return Category_Name;
	}

	public void setCategory_Name(String category_Name) {
		Category_Name = category_Name;
	}

	@Override
	public String toString() {
		return "Category [Category_Id=" + Category_Id + ", Category_Name=" + Category_Name + "]";
	}
	
	
}
