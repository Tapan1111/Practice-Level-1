package practice.Arrays;

import java.util.Arrays;

public class SortingByTwoPointers {
	public static void main(String[] args) {
		SortingByTwoPointers solutioon = new SortingByTwoPointers();
		int[] arr = { 1, 1, 1, 1, 0, 0, 1, 0 };
		int[] result = solutioon.solve(arr);
		System.out.println(Arrays.toString(result));
	}

	public int[] solve(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		int n = arr.length;
		while (s < e) {
			if (arr[s] == 1 && arr[e] == 0) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
			if (arr[s] == 0) {
				s++;
			}
			if (arr[e] == 1) {
				e--;
			}
		}
		return arr;
	}
}
