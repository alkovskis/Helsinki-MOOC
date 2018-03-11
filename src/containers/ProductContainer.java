package containers;

import java.util.ArrayList;

public class ProductContainer extends Container {
	String productName;
	

	public ProductContainer(String productName, double capacity) {
		super(capacity);
		this.productName = productName;
	}

	public String getName() {
		return this.productName;
	}

	public void setName(String newName) {
		this.productName = newName;
	}
	
	public String toString() {
		return getName()+": "+super.toString();
	}

}
