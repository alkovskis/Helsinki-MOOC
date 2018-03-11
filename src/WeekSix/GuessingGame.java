package WeekSix;

import java.util.Scanner;

public class GuessingGame {
	private Scanner reader;

	public GuessingGame() {
		this.reader = new Scanner(System.in);
	}

	public void play(int lowerLimit, int upperLimit) {
		instructions(lowerLimit, upperLimit);
		int i = -1;
		while (i < howManyTimesHalvable(upperLimit - lowerLimit)) {
			if (upperLimit == lowerLimit) {
				break;
			}
			if (isGreaterThan(average(lowerLimit, upperLimit))) {
				lowerLimit = this.average(lowerLimit, upperLimit);
			} else {
				upperLimit = this.average(lowerLimit, upperLimit);
			}
			i++;
		} System.out.println("The number you're thinking of is "+ upperLimit);

		// write the game logic here
	}

	public boolean isGreaterThan(int value) {
		System.out.println("Is your number greater than " + value + "? (y/n)");
		String answer = reader.nextLine();
		if (answer.equals("y")) {
			return true;
		} else
			return false;
	}

	public int average(int firstNumber, int secondNumbr) {
		return (firstNumber + secondNumbr) / 2;
	}

	public void instructions(int lowerLimit, int upperLimit) {
		int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

		System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

		System.out.println(
				"I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
		System.out.println("");
		System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
		System.out.println("");
	}

	public static int howManyTimesHalvable(int number) {
		int answer = (int) (Math.log(number) / Math.log(2)) + 1;
		return answer;
	}

	public static void main(String[] args) {
		GuessingGame game = new GuessingGame();
		game.play(1, 10);

	}

}
