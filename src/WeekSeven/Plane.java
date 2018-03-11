package WeekSeven;

import java.util.HashMap;

public class Plane {
	HashMap<String, Integer> planes;

	public Plane() {
		planes = new HashMap<String, Integer>();
	}

	public void addPlane(String id, int cap) {
		planes.put(id, cap);
	}

}
