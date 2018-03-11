package movable;

import java.util.ArrayList;

public class Group implements Movable {

	ArrayList<Movable> list = new ArrayList<Movable>();

	public void addToGroup(Movable movable) {
		list.add(movable);
	}

	public String toString() {
		String group = "";
		for (Movable l : list) {
			group+= l.toString();
			group+="\n";
		}
		return group;

	}

	@Override
	public void move(int dx, int dy) {
		for (Movable l : list) {
			l.move(dx, dy);
		}

	}

}
