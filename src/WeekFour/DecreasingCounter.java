package WeekFour;

public class DecreasingCounter {

	private int value; // object variable that remembers the value of the counter
	private int valueInitial;

	public DecreasingCounter(int valueAtStart) {
		this.value = valueAtStart;
		this.valueInitial=valueAtStart;
	}

	public void printValue() {
		System.out.println("value: " + this.value);
	}

	public void decrease() {
		if (this.value <= 0) {
			this.value = 0;
		} else
			this.value--;
	}

	public void reset() {
		this.value = 0;
	}

	public void setInitial() {
		this.value=this.valueInitial;
		

	}

	public static void main(String[] args) {
		DecreasingCounter counter = new DecreasingCounter(100);

		counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();

	}

}
