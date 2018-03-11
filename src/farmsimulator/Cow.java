package farmsimulator;

import java.util.Random;

public class Cow implements Alive, Milkable {
	private String name;
	private static final String[] NAMES = new String[] { "Anu", "Arpa", "Essi", "Heluna", "Hely", "Hento", "Hilke",
			"Hilsu", "Hymy", "Ihq", "Ilme", "Ilo", "Jaana", "Jami", "Jatta", "Laku", "Liekki", "Mainikki", "Mella",
			"Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu",
			"Virpi" };
	private double amount;
	private int capacity;

	public Cow() {
		int num = 0 + new Random().nextInt(NAMES.length);
		this.name = NAMES[num];
		getCapacity();

	}

	public Cow(String name) {
		this.name = name;
		getCapacity();
	}

	public String getName() {
		return this.name;
	}

	public double getCapacity() {
		int num = 15 + new Random().nextInt(26);
		return this.capacity = num;
	}

	public double getAmount() {
		return this.amount;
	}

	public String toString() {
		return this.name + " " + getAmount() + "/" + this.capacity;
	}

	@Override
	public double milk() {
		double tempAmountOfMilk = this.amount;
		this.amount = 0;
		return tempAmountOfMilk;
	}

	@Override
	public void liveHour() {
		this.amount += 0.7 + new Random().nextInt(2);

	}
}
