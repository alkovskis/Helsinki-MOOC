package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

	private int maximumCapacity;
	private List<Thing> things = new ArrayList<Thing>();

	public Box(int maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}

	public boolean addThing(Thing thing) {
		if (thing.getVolume() <= this.maximumCapacity) {
			things.add(thing);
			return true;
		} else
			return false;

	}

	public int volumeOfThings() {
		int volume = 0;
		for (Thing t : things) {
			volume += t.getVolume();
		}
		return volume;
	}

	@Override
	public int getVolume() {

		return volumeOfThings();
	}

}
