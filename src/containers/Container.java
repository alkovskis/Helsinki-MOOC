package containers;

public class Container {

	double capacity;
	double volume;

	public Container(double capacity) {
		this.capacity = capacity;
	}

	public double getVolume() {
		return this.volume;
	}

	public double getOriginalCapacity() {

		return this.capacity;

	}

	public double getCurrentCapacity() {
		return this.capacity - this.volume;
	}

	public void addToTheContainer(double amount) {
		if (amount < 0) {
			return;
		}
		if (amount <= getCurrentCapacity()) {
			this.volume += amount;
		} else {
			this.volume = this.capacity;
		}

	}

	public double takeFromTheContainer(double amount) {
		return this.volume -= amount;

	}

	public String toString() {
		return "volume =" + getVolume() + ", free space " + getCurrentCapacity();

	}

}
