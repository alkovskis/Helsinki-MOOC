package WeekEight;

import java.util.ArrayList;

public class Box implements ToBeStored {

	ArrayList<ToBeStored> storage = new ArrayList<ToBeStored>();
	private int maxCapacity;
	private double totalWeight;

	public Box(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public void add(ToBeStored stored) {
		if (this.maxCapacity >= storage.size()) {
			totalWeight += stored.weight();
			storage.add(stored);
		}
	}

	public void howManyItems() {
		System.out.println(storage.size());
	}

	public String toString() {
		return "Box: " + storage.size() + "  things, total weight " + totalWeight + " kg";
	}
	public void print() {
		for(ToBeStored t:storage) {
			
			System.out.println(t.name());
		}
	}

	@Override
	public double weight() {
		return this.totalWeight;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

}
