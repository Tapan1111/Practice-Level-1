package ArraysFormDiffSources;

import java.util.Arrays;

public class InsertAnElementInAnArray {
	public static void main(String[] args) {
		InsertAnElementInAnArray insert = new InsertAnElementInAnArray();
		int[] arr = new int[7];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		int pos = 2;
		int x = 22;
		insert.solution(arr, pos, x);


	}

	public void solution(int[] arr, int pos, int x) {
		int n = arr.length;
		for (int i = n - 1; i > pos; i--) {
			arr[i] = arr[i - 1];

		}
		arr[pos] = x;

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));

	}
}
