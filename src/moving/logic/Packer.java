package moving.logic;

import java.util.ArrayList;
import java.util.List;

import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;

public class Packer {
	private int boxVolume;

	public Packer(int boxVolume) {
		this.boxVolume = boxVolume;
	}

	public List<Box> packThings(List<Thing> things) {
		List<Box> buffer = new ArrayList<Box>();
		Box box = new Box(this.boxVolume);
		for (Thing i : things) {

			while (box.addThing(i)) {
				System.out.println("Adding things");
			}

			if (!box.addThing(i)) {
				buffer.add(box);
				box = new Box(this.boxVolume);
			}
		}

		return buffer;

	}

}
