
public class least {

	public static int least(int number1, int number2) {
		int least = Math.min(number1, number2);
		return least;
	}

	public static void main(String[] args) {
		int answer = least(2, 7);
		System.out.println("Least: " + answer);
		int answerOne = greatest(2, 7, 9);
		System.out.println("Greatest: " + answerOne);
		double AnswerTwo = average(4, 3, 6, 1);
		System.out.println("average: " + AnswerTwo);
	}

	public static int greatest(int number1, int number2, int number3) {
		int greatest = Math.max(number1, number2);
		if (greatest > number3) {
			return greatest;
		} else
			return number3;
	}

	public static double average(int number1, int number2, int number3, int number4) {
		double avrg = (double) (number1 + number2 + number3 + number4) / 4;
		return avrg;
	}

}
