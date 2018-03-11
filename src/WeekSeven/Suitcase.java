package WeekSeven;

import java.util.ArrayList;

public class Suitcase {
	private int weigthLimit;
	private ArrayList<Thing> things = new ArrayList<Thing>();
	private int totalWeight;

	public Suitcase(int weightLimit) {
		this.weigthLimit = weightLimit;
	}

	public int totalWeight() {
		int sum = 0;
		for (Thing t : things) {
			sum += t.getWeight();
		}
		return this.totalWeight = sum;

	}

	public int suitcaseLength() {
		return things.size();

	}

	public void addThing(Thing thing) {
		if (totalWeight + thing.getWeight() > weigthLimit) {
		} else
			things.add(thing);

	}

	public String checkSpelling() {
		String answer = "";
		if (suitcaseLength() == 0) {
			answer = "empty";
		} else if (suitcaseLength() == 1) {
			answer = "thing";
		} else
			answer = "things";
		return answer;
	}

	public void printThings() {
		for (Thing t : things) {
			System.out.println(t);
		}
	}

	public Thing heaviestThing() {
		int a = 0;
		int i = 0;
		Thing answer = null;
		for (i = 0; i < things.size(); i++) {
			if (things.get(i).getWeight() > a) {
				a = things.get(i).getWeight();
				 answer = things.get(i);
			}
		}
		return answer;
	}

	public String toString() {
		return suitcaseLength() + " " + checkSpelling() + " (" + totalWeight() + " kg)";
	}

}
