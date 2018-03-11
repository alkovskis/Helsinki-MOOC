import java.util.ArrayList;
import java.util.Scanner;

public class ReccuringWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = "hi";
		ArrayList<String> words = new ArrayList<String>();

		while (true) {
			System.out.print("Type a word: ");
			word = scanner.nextLine();
			if (words.contains(word)) {
				System.out.println("You gave the word " + word + " twice");
				break;
			}
			words.add(word);

		}
	}

}
