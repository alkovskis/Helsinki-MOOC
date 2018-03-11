package WeekFour;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberStatistics {

	private int amountOfNumbers;
	private int sum;

	public NumberStatistics() {
		// initialize here the object variable amountOfNumbers
	}

	public void addNumber(int number) {
		amountOfNumbers++;
		if (number != -1) {
			sum = number + sum;
		}

	}

	public int amountOfNumbers() {
		return amountOfNumbers;
	}

	public int sum() {
		return sum;
	}

	public double average() {
		return (double) sum / amountOfNumbers;
	}

	public static void main(String[] args) {
		NumberStatistics all = new NumberStatistics();
		NumberStatistics even = new NumberStatistics();
		NumberStatistics odd = new NumberStatistics();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number: ");
		int n = 0;
		while (n != -1) {

			n = Integer.parseInt(scanner.nextLine());
			
			if (n != -1) {
				all.addNumber(n);

				if (n % 2 == 0) {
					even.addNumber(n);
				} else
					odd.addNumber(n);
			}

		}
		System.out.println("sum: " + all.sum());
		System.out.println("sum of even: " + even.sum());
		System.out.println("sum of odd: " + odd.sum());

	}

}
