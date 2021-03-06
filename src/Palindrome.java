import java.util.Scanner;

public class Palindrome {
	public static boolean palindrome(String text) {
		if (text.equals((reverse(text)))) {
			return true;
		}
		return false;
	}

	public static String reverse(String word) {
		return new StringBuilder(word).reverse().toString();
		}

	

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a text: ");
		String text = reader.nextLine();
		if (palindrome(text)) {
			System.out.println("The text is a palindrome!");
		} else {
			System.out.println("The text is not a palindrome!");
		}
	}

}
