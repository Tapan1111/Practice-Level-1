package practice.Arrays;

import java.util.Arrays;

public class SortinngZerosAndOnes {
	public static void main(String[] args) {
		SortinngZerosAndOnes sort = new SortinngZerosAndOnes();
		int[] arr = { 1, 0, 0, 0, 1, 1, 0, 1 };
		int[] res = sort.solve(arr);
		System.out.println(Arrays.toString(res));
	}

	public int[] solve(int[] arr) {

		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {

			if (arr[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (i < count) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}
		return arr;
	}
}
