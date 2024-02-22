package practice.Arrays;

import java.util.Arrays;

public class SortingEvenAndOdd {
	public static void main(String[] args) {
		SortingEvenAndOdd sorting = new SortingEvenAndOdd();
		int[] arr = { 8, 6, 4, 5, 3, 1 };
		int[] result = sorting.solve(arr);
		System.out.println(Arrays.toString(result));

	}

	public int[] solve(int[] arr) {
		int n = arr.length;
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			if (arr[s] % 2 != 0 && arr[e] % 2 == 0) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
			if (arr[s] % 2 == 0) {
				s++;
			}
			if (arr[e] % 2 == 1) {
				e--;
			}
		}
		return arr;
	}

}
