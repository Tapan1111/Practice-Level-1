package PracticeAcc;

import java.util.Arrays;

public class ShuffleAnArray {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int[] res = shuffle(nums);
		System.out.println(Arrays.toString(res));

	}

	public static int[] shuffle(int[] arr) {
		int length = arr.length;
		int[] ans = new int[length];
		int idx = 0;
		int half = length / 2;
		int s = 0;
		int m = half;
		while (m < length) {
			ans[idx] = arr[s];
			ans[idx + 1] = arr[m];
			s++;
			m++;
			idx = idx + 2;
		}
		return ans;
	}
}
