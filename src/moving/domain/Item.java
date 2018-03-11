package moving.domain;

public class Item implements Thing, Comparable<Item> {

	private String name;
	private int volume;

	public Item(String name, int volume) {
		this.name = name;
		this.volume = volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

	public String toString() {
		return this.name + " (" + this.volume + " dm^3)";
	}

	@Override
	public int compareTo(Item o) {
		if (this.volume > o.volume) {
			return 1;
		} else if (this.volume == o.volume) {
			return 0;
		} else
			return -1;
	}

}
