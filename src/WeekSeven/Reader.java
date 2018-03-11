package WeekSeven;

import java.util.Scanner;

public class Reader {
	private Scanner scanner=new Scanner(System.in);

	public String readString() {
		String s = scanner.nextLine();
		return s;
	}

	public int readInteger() {
		int i = Integer.parseInt(scanner.nextLine());
		return i;

	}
}
