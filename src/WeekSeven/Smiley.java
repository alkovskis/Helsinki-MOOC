package WeekSeven;

public class Smiley {

	private static void printWithSmileys(String characterString) {
		if (characterString.length() <= 6) {
			int number = characterString.length();

			printSmiley(number);
			System.out.println();
			if (oddNumber(number)) {
				System.out.println(":) " + characterString + " :)");
			} else
				System.out.println(":) " + characterString + "  :)");
			printSmiley(number);
		}

	}

	public static void printSmiley(int number) {
		if (oddNumber(number)) {
			for (int i = 0; i < (number + 1); i++) {
				System.out.print(":)");
			}
		} else {
			for (int i = 0; i < (number + 2); i++) {
				System.out.print(":)");
			}
		}
	}

	public static boolean oddNumber(int number) {
		boolean result = false;
		if (number % 2 == 0) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		printWithSmileys("\\:D/");
		System.out.println();
		printWithSmileys("87.");

	}

}
