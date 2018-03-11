import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.print("In reverse order: ");
		for(int i=name.length()-1;i>=0;i--) {
			char c=name.charAt(i);
			System.out.print(c);
		}
		
	}
}
