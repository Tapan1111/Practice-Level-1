package Sorting;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		BubbleSorting bubbleSorting = new BubbleSorting();

		int[] arr = { 5, 8, 6, 2, 1, 9, 66 };
		bubbleSorting.sorting(arr);

	}

	public static void sorting (int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(isSmaller(arr, j+1, j)) {
					swap(arr, j + 1, j);
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	private static boolean isSmaller(int[] arr, int i, int j) {
		if (arr[i] < arr[j]) {
			return true;
		}
		return false;
	}

}
