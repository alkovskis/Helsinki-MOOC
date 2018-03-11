import java.util.ArrayList;

public class Variance {
	public static double variance(ArrayList<Integer> list) {
		double sum=0;
		double total=0;
		for (int i = 0; i < list.size(); i++) {
			sum=Math.pow(list.get(i) - SumOfTheNumbers.average(list), 2);
			total+=sum;
		}
		total=total/(list.size()-1);
		return total;

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("The variance is: " + variance(list));
	}
}
