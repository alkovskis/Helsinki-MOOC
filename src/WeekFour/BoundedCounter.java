package WeekFour;

import java.util.Scanner;

public class BoundedCounter {

	private int value = 0;
	private int upperLimit;

	public BoundedCounter(int upperLimit) {
		this.upperLimit = upperLimit;
	}

	public void next() {
		if (value <= upperLimit) {
			value++;

		}
		if (value > upperLimit) {
			value = 0;
		}

	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		if (value / 10 < 1) {
			return "0" + value;
		} else
			return "" + value;
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		BoundedCounter seconds = new BoundedCounter(59);
		BoundedCounter minutes = new BoundedCounter(59);
		BoundedCounter hours = new BoundedCounter(23);

		System.out.print("seconds: ");
		int s = reader.nextInt();
		System.out.print("minutes: ");
		int m = reader.nextInt();
		System.out.print("hours: ");
		int h = reader.nextInt();

		seconds.setValue(s);
		minutes.setValue(m);
		hours.setValue(h);

		int i = 0;
		while (i < 121) {
			System.out.println(hours + ":" + minutes+":"+seconds); 
			seconds.next();
			if(seconds.getValue()==0) {
				minutes.next();
				if (minutes.getValue() == 0) {
					hours.next();

					i++;
				}
			}
			
		}

	}
}
