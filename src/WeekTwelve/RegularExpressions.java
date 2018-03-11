package WeekTwelve;

import java.util.Scanner;

public class RegularExpressions {

	public static boolean isAWeekDay(String string) {
		if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
			System.out.println("The form is fine");
			return true;
		} else
			System.out.println("The form is wrong");
		return false;
	}

	public static boolean allVowels(String string) {
		if (string.matches("(a|e|y|u|o|i)+")) {
			System.out.println("The form is fine");
			return true;
		} else
			System.out.println("The form is wrong");
		return false;
	}

	public static boolean clockTime(String string) {
		if (string.matches("[01]?[0-9]|2[0-3].[0-5][0-9].[0-5][0-9]")) {
			System.out.println("The form is fine");
			return true;
		} else
			System.out.println("The form is wrong");
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RegularExpressions r = new RegularExpressions();
		System.out.print("Give a sttring: ");
		String a = scanner.nextLine();
		//r.allVowels(a);
		r.clockTime(a);

	}

}
