package boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box {

	private int maxWeight;
	Thing thing;
	ArrayList<Thing> things = new ArrayList<Thing>();
	int totalWeight;

	public  MaxWeightBox(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	

	@Override
	public void add(Thing thing) {
		this.thing = thing;
		totalWeight+=thing.getWeight();
		if (this.totalWeight <= this.maxWeight) {
			things.add(this.thing);

		}

	}

	@Override
	public boolean isInTheBox(Thing thing) {
		boolean flag=false;
		for (Thing t : things) {
			if (thing.getName().equals(t.getName())) {
				flag= true;
			}
		}
		return flag;
	}

}
