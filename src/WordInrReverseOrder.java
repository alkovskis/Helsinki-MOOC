import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class WordInrReverseOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = "hi";
		ArrayList<String> words = new ArrayList<String>();
		while (!word.isEmpty()) {
			System.out.println("Type a word:  ");
			word = scanner.nextLine();
			words.add(word);
		}
		System.out.println("You typed the following words: ");
		Collections.reverse(words);
		for (String printWord : words) {
			System.out.println(printWord);
		}

	}

}
