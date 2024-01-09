package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class NewList {
	public static void main(String[] args) {
		List<String> words = List.of("Audi", "Merc", "Range");
		System.out.println(words.indexOf("Merc"));
		System.out.println(words.contains("Merc"));
		System.out.println(words.size());
		System.out.println(words.isEmpty());
		System.out.println(words.get(2));
		// words.add("dog");
		System.out.println(words);
		List<String> newList = List.of("Girrafe", "Zebra", "Yak");

		List<String> arrList = new ArrayList<String>(words);
		arrList.add("Thar");
		arrList.addAll(newList);
		arrList.add(2, "Corolla");
		arrList.set(7, "GTR");
		arrList.remove(6);
		arrList.add("Thar");
		System.out.println(arrList);

		List<String> linkedList = new LinkedList<String>(words);
		linkedList.add("Polo");
		linkedList.addAll(newList);
		System.out.println(linkedList);


		List<String> vectorList = new Vector<String>(words);
		vectorList.add("LandCruiser");
		vectorList.addAll(newList);
		vectorList.add("LandCruiser");
		System.out.println(vectorList);

		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		System.out.println();

		for (String lst : arrList) {
			System.out.println(lst);
		}
		System.out.println();


		Iterator wordsIterator = vectorList.iterator();
		while (wordsIterator.hasNext()) {
			System.out.println(wordsIterator.next());
		}
	}

}
