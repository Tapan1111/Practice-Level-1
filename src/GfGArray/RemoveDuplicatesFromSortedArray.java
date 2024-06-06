package GfGArray;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
////		int[] arr = { 10, 20, 20, 30, 30, 30 };
////
////		System.out.println(remDups(arr));
//
//		int arr[] = new int[5], cap = 5, n = 3;
//
//		arr[0] = 5;
//		arr[1] = 10;
//		arr[2] = 20;
//
//		System.out.println("Before Insertion");
//
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//
//		System.out.println();
//
//		int x = 7, pos = 2;
//
//		n = insert(arr, n, x, cap, pos);
//
//		System.out.println("After Insertion");
//
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
		int[] arr = { 2, 7, 3, 9, 6, 5, 4 };
		int[] result = prefixSum(arr);
		System.out.println(Arrays.toString(result));
		System.out.println(getSum(2, 4, arr));

	}

	static int insert(int arr[], int n, int x, int cap, int pos) {
		if (n == cap)
			return n;

		int idx = pos - 1;

		for (int i = n - 1; i >= idx; i--) {
			arr[i + 1] = arr[i];
		}

		arr[idx] = x;

		return n + 1;
	}

	public static int removeDuplicates(int[] arr) {
		int[] temp = new int[arr.length];

		temp[0] = arr[0];
		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}
		for (int i = 0; i < res; i++) {
			arr[i] = temp[i];
		}
		return res;
	}

	public static int[] prefixSum(int[] arr) {
		int n = arr.length;
		int[] pref = new int[n];
		pref[0] = arr[0];
		for (int i = 1; i < n; i++) {
			pref[i] = pref[i - 1] + arr[i];
		}
		return pref;
	}

	public static int getSum(int l, int r, int[] arr) {
		int[] pref = prefixSum(arr);
		if (l == 0) {
			return pref[r];
		} else {
			return pref[r] - pref[l - 1];
		}
	}
	public static int remDups(int[] arr) {
		int n = arr.length;
		int res = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}
}
