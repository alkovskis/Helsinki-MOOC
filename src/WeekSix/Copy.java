package WeekSix;

import java.util.Arrays;

public class Copy {
	public static int[] copy(int[] array) {
		int[] copy = array.clone();
		return copy;

	}

	public static int[] reverseCopy(int[] array) {
		int[] reverse = new int[array.length];
		int i = 0;
		for (int j = array.length - 1; j >= 0; j--) {
			reverse[i] = array[j];
			i++;
		}
		return reverse;

	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4 };
		int[] reverse = reverseCopy(original);

		// print both
		System.out.println("original: " + Arrays.toString(original));
		System.out.println("reversed: " + Arrays.toString(reverse));
	}
}
