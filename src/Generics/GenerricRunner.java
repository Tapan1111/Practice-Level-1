package Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenerricRunner {

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	public static void main(String[] args) {
		
		String ans = doubleValue(new String());
		Integer res = doubleValue(Integer.valueOf(7));
		ArrayList output = doubleValue(new ArrayList());
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6));
		LinkedList<Integer> number2 = new LinkedList<Integer>(List.of(1, 2, 3));
		duplicate(numbers);
		duplicate(number2);
		System.out.println(numbers);
		System.out.println(number2);

		MyCustom<String> list = new MyCustom<>();
		list.addElement("Element1");
		list.addElement("Element2");
		String value = list.get(0);

		System.out.println(value);

		MyCustom<Integer> list2 = new MyCustom<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(8));
		Integer number = list2.get(0);

		System.out.println(number);

	}

}
