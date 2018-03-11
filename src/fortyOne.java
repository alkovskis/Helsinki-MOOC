import java.util.Scanner;

public class fortyOne {

	public static void drawNumber(int num) {
		if (num >= 0 && num <= 100) {
		} else
			System.out.println("Wrong number!");
	}

	public static void main(String[] args) {
		int num = 8;
		drawNumber(num);
		Scanner scanner = new Scanner(System.in);
		int input;
		int guess=0;
		while (true) {
			System.out.print("Guess a number: ");
			input = Integer.parseInt(scanner.nextLine());
			guess++;
			if (num == input) {
				System.out.println("Congratulations, your guess is correct!");
				break;
			}
			else if (num > input) {
				System.out.println("The number is greater, guesses made: "+guess);
			} else if (num < input) {
				System.out.println("The number is lesser, guesses made: "+guess);
			}
			
		}

	}

}
