package WeekSeven;

import java.util.ArrayList;

public class Container {
	int maxWeight;
	ArrayList<Suitcase> container = new ArrayList<Suitcase>();

	public Container(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public void addSuitcase(Suitcase suitcase) {
		if (containerWeight() + suitcase.totalWeight() > maxWeight) {

		} else
			container.add(suitcase);
	}

	public int containerWeight() {
		int sum = 0;
		for (Suitcase s : container) {
			sum += s.totalWeight();
		}
		return sum;
	}
	public void printThings() {
		for(Suitcase s:container) {
			s.printThings();
		}
	}

	public String toString() {
		return container.size() + " suitcases (" + containerWeight() + " kg)";
	}

}
