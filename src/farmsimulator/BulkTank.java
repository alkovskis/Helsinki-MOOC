package farmsimulator;

public class BulkTank {

	private double capacity = 2000;
	private double volume;

	public BulkTank() {

	}

	public BulkTank(double capacity) {
		this.capacity = capacity;
	}

	public double getCapacity() {
		return this.capacity;
	}

	public double getVolume() {
		return this.volume;
	}

	public double howMuchFreeSpace() {
		return (this.capacity - this.volume);
	}

	public void addToTank(double amount) {
		if (this.capacity - this.volume > amount) {
			this.volume += amount;
		} else
			this.volume = this.capacity;
	}

	public double getFromTank(double amount) {
		if (this.volume >= amount) {
			return this.volume -= amount;
		} else
			return this.volume = 0;
	}
	public String toString() {
		return getVolume()+"/"+getCapacity();
	}

}
