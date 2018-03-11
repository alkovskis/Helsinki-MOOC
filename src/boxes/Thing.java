package boxes;

public class Thing {

	private int weight;
	private String name;

	public Thing(String name, int weight) {
		this.name = name;
		if (weight >= 0) {
			this.weight = weight;
		} else
			throw new IllegalArgumentException("Weight cannot be negative");
	}

	public Thing(String name) {
		this.name = name;
		this.weight = 0;
	}

	public boolean equals(Object obj) {
		boolean flag = false;
		Thing thing = (Thing) obj;
		if (thing.weight == weight) {
			flag = true;
		}
		return flag;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
