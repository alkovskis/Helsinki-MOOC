package WeekEight;

public class Jumper {
	private String name;
	private int points;

	public Jumper(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return this.points;
	}

	public String toString() {
		return this.name + " (" + getPoints() + " points)";
	}

}
