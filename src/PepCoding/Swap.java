package PepCoding;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {

		int[] arr = { 1, 33, 55, 67, 9 };
		max(arr);

		maxRange(arr, 0, 3);

		reverse(arr, 0, arr.length - 1);

		swap(arr, 2, 4);
		System.out.println(Arrays.toString(arr));


	}

	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void reverse(int[] arr, int s, int e) {
		for (int i = 0; i < arr.length; i++) {
			while (s < e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void max(int[] arr) {
		int maximumNo = Integer.MIN_VALUE;
		for (int nums : arr) {
			if (nums > maximumNo) {
				maximumNo = nums;
			}
		}
		System.out.println(maximumNo);
	}

	public static void maxRange(int[] arr, int s, int e) {
		int maximumNo = arr[s];
		for (int i = s; i < e; i++) {
			if (arr[i] > maximumNo) {
				maximumNo = arr[i];
			}
		}
		System.out.println(maximumNo);
	}

}
