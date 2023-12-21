package practice.Arrays;

import java.util.Arrays;

public class PersonRunner {

	public static void main(String[] args) {
		Person p1 = new Person();

		Person[] p2 = new Person[6];

		Person[] persons = { new Person(), new Person() };
		System.out.println(Arrays.toString(persons));

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		for (int content : arr) {
//			System.out.println(content);

		}
//		System.out.println(Arrays.toString(arr));

		int[] marks = new int[5];
		Arrays.fill(marks, 11);
//		System.out.println(Arrays.toString(marks));

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
//		System.out.println(Arrays.equals(arr1, arr2));

	}

}
