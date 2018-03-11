package containers;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {
	ArrayList<Double> list;

	public ContainerHistory() {
		this.list = new ArrayList<Double>();
	}

	public void add(double situation) {
		list.add(situation);
	}

	public void reset() {
		list.removeAll(list);
	}

	public String toString() {
		return this.list.toString();
	}

	public double maxValue() {
		return Collections.max(this.list);
	}

	public double minValue() {
		return Collections.min(this.list);
	}

	public double average() {
		double sum = 0;
		for (double l : list) {
			sum += l;
		}
		return sum / list.size();
	}

}
