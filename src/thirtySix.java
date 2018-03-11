import java.util.Scanner;

public class thirtySix {

	public static void main(String[] args) {

		System.out.println("Type numbers:");
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		int count = 0;
		double avrg = 0;
		int odd = 0;
		int even = 0;
		while (true) {
			input = Integer.parseInt(scanner.nextLine());

			if (input == -1) {
				System.out.println("Thank you and see you later!");
				break;
			}
			sum += input;
			count++;
			avrg = (double) sum / count;

			if (input % 2 != 0) {
				odd++;
			}
			if (input % 2 == 0) {
				even++;
			}
		}
		System.out.println("The sum is: " + (sum));
		System.out.println("How many numbers: " + (count));
		System.out.println("Avarage: " + avrg);
		System.out.println("Even numbers : " + even);
		System.out.println("Odd numbers: " + odd);
	}

}
