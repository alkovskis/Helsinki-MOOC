import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a word");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		System.out.println("Length of the first part: ");
		int lentgh=Integer.parseInt(scanner.nextLine());
		
		System.out.println(word.substring(0,lentgh));
		
		

	}

}
