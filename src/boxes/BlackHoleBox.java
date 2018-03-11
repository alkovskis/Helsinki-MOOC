package boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box {

	List<Thing> things = new ArrayList<Thing>();

	public BlackHoleBox() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Thing thing) {
		things.add(thing);

	}

	@Override
	public boolean isInTheBox(Thing thing) {
		return false;
	}

}
