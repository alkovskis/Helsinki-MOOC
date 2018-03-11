package WeekFour;

import java.util.ArrayList;

public class CombiningArrayLists {

	/*public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
		first.addAll(second);
	}*/
	public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
		for(Integer findSecond:second) {
			if(!first.contains(findSecond)) {
				first.add(findSecond);
			};
		}
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(4);
		list1.add(13);
		list1.add(8);
		list1.add(9);
		list1.add(11);
		list1.add(16);

		list2.add(5);
		list2.add(8);
		list2.add(7);
		//combine(list1, list2);
		
		smartCombine(list1, list2);

		System.out.println(list1); 

		System.out.println(list2);

	}
}
