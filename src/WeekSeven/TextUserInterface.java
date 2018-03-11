package WeekSeven;

import java.util.Scanner;

public class TextUserInterface {

	private Scanner reader;
	private Dictionary dic;

	public TextUserInterface(Scanner reader, Dictionary dictionary) {
		this.dic = dictionary;
		this.reader = reader;

	}

	public void statement() {
		System.out.println("Statements:");
		System.out.println("   add - adds a word pair to the dictionary");
		System.out.println("   quit - quit the text user interface");
		System.out.println("   translate - asks a word and prints its translation");

	}

	public void start() {
		statement();

		while (true) {
			System.out.print("Statement: ");
			String statement = reader.nextLine();
			if (statement.equals("quit")) {
				System.out.println("Cheers!");
				break;
			} else if (statement.equals("add")) {
				System.out.println("In Finnish: ");
				String finnish = reader.nextLine();
				System.out.println("Translation: ");
				String translate = reader.nextLine();
				dic.add(finnish, translate);
				System.out.println();

			} else if (statement.equals("translate")) {
				System.out.println("Give a word: ");
				String word = reader.nextLine();
				System.out.println("Translation: ");
				System.out.println(this.dic.translate(word));
				System.out.println();

			} else
				System.out.println("Unknown statement");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Dictionary dict = new Dictionary();

		TextUserInterface ui = new TextUserInterface(reader, dict);
		ui.start();

	}

}
