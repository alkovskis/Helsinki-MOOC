import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		for (int i = 0, q = 1; i < name.length(); i++, q++) {
			char c = name.charAt(i);
			System.out.printf("%d. character: %c%n", q, c);
		}

	}

}
