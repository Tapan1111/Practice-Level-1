package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EkOrList {
	public static void main(String[] args) {

		List<String> list1 = List.of("Bed", "Chair", "Cupborad", "Cad", "Lights");

		// System.out.println(list1);


		List<String> list2 = new ArrayList<String>(list1);
//		// System.out.println(list2);
//		for (String words : list2) {
//			if (words.endsWith("ts")) {
//				list2.remove(words);
//			}
//			// System.out.println(list2);
//
//		}
		Iterator<String> wordsAl = list2.iterator();
		while (wordsAl.hasNext()) {
			if (wordsAl.next().endsWith("ad")) {
				wordsAl.remove();
			}
			System.out.println(list2);
		}

		List<Integer> numbers = List.of(101, 202, 303, 404, 505);
		List<Integer> numbers1 = new ArrayList<Integer>(numbers);
		System.out.println(numbers1);

		numbers1.remove(0);
		System.out.println(numbers1);
		numbers1.remove(Integer.valueOf(303));
		System.out.println(numbers1);
		numbers1.remove(1);
		System.out.println(numbers1);

	}

	

}

