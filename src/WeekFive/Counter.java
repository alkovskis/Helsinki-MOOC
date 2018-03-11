package WeekFive;

public class Counter {

	private int number = 0;
	private boolean check = false;;

	public Counter(int startingValue, boolean check) {
		this.number = startingValue;
		this.check = check;
	}

	public Counter(int startingValue) {
		this(startingValue, false);
	}

	public Counter(boolean check) {
		this(0, check);
	}

	public Counter() {
		this(0, false);
	}

	public int getValue() {
		return number;
	}

	public void increase() {
		this.number++;
	}

	public void decrease() {
		if (check) {
			if (this.number > 0) {
				this.number--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
