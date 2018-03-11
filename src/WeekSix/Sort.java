package WeekSix;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class Sort {

	public static int smallest(int[] array) {
		int i = 0;
		int small = array[0];
		for (i = 0; i < array.length; i++) {
			if (small >= array[i]) {
				small = array[i];
			}
		}
		return small;
	}

	public static int smallestFromIndex(int[] array, int index) {

		int small = array[index];
		for (int i = index; i < array.length; i++) {
			if (small >= array[i]) {
				small = array[i];
			}
		}
		return small;
	}

	public static int indexOfTheSmallest(int[] array) {

		int a = 0;
		int small = smallest(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == small) {
				a = i;
			}
		}
		return a;
	}

	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		int a = 0;
		int small = smallestFromIndex(array, index);
		for (int i = index; i < array.length; i++) {
			if (array[i] == small) {
				a = i;
			}
		}
		return a;

	}
	public static void swap(int[] array, int index1, int index2) {
	    for(int i=0;i<array.length;i++) {
	    	int a=array[index1];
	    	int b=array[index2];
	    	array[index2]=a;
	    	array[index1]=b;
	    }
	}
	public static void sort(int[] array) {
		
	}

	public static void main(String[] args) {
		int[] values = {3, 2, 5, 4, 8};

		System.out.println( Arrays.toString(values) );

		swap(values, 1, 0);
		System.out.println( Arrays.toString(values) );

		swap(values, 0, 3);
		System.out.println( Arrays.toString(values) );
	}

}
