package boxes;

import java.util.ArrayList;

public class OneThingBox extends Box {

	ArrayList<Thing> things = new ArrayList<Thing>();

	public OneThingBox() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Thing thing) {
		if (this.things.size() < 1) {
			things.add(thing);
		}

	}

	@Override
	public boolean isInTheBox(Thing thing) {
		boolean flag = false;
		for (Thing t : things) {
			if (thing.getName().equals(t.getName())) {
				flag = true;
			}
		}
		return flag;
	}

}
