package containers;

public class ProductContainerRecorder extends ProductContainer {
	double initialVolume;

	public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
		super(productName, capacity);
		this.initialVolume = initialVolume;
	}


}
