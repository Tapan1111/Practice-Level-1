package practice.BossCoder.ArrayList;

import java.util.Arrays;

public class ArrayMagicRunner {

	public static void main(String[] args) {

		ArrayMagic magic = new ArrayMagic();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 9, 2, 3, 4, 5, 6, 7, 8 };
		magic.doesElementGreaterThan(arr, 6);
		System.out.println(magic.doesElementGreaterThan(arr, 6));
		magic.findSecondLargestElement(arr);
		System.out.println(magic.findSecondLargestElement(arr));

		BiArray biarr = new BiArray(arr, arr2);
		biarr.areSumEqual();
		System.out.println(biarr.areSumEqual());

		magic.isSorted(arr2);
		System.out.println(magic.isSorted(arr2));

		int[] storedreversearray = magic.reverseArray(arr);
		System.out.println(Arrays.toString(storedreversearray));

	}

}
