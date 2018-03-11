import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Hangman {

	public static void printMenu() {
		System.out.println(" * menu *");
		System.out.println("quit   - quits the game");
		System.out.println("status  - prints the game status");
		System.out.println("a single letter uses the letter as a guess");
		System.out.println("an empty line prints this menu");
	}

	public boolean gameOn() {
		return true;
 
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Hangman hangman = new Hangman();

		System.out.println("************");
		System.out.println("* Hangman *");
		System.out.println("************");
		System.out.println("");
		printMenu();
		System.out.println("");
		

		while (hangman.gameOn()) {
			System.out.println("Type a command: ");
			String command = reader.nextLine();
			if(command.equals("status")) {
				 hangman.printStatus();
			}
			else if (command.equals("quit")) {
				break;
			}
		}

		System.out.println("Thank you for playing!");

	}

	private void printStatus() {
		System.out.println("You have not made any guesses yet.");
		System.out.println("Unused letters: abcdefghijklmnopqrstuvwxyz");
	}

}
