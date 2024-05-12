package PracticeAcc;

import java.util.Arrays;

public class ShuffleAnArray {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		int[] res = shuffle(nums, n);
		System.out.println(Arrays.toString(res));

	}

	public static int[] shuffle(int[] nums, int n) {
		int length = nums.length;
		int[] ans = new int[length];
		int l = 0;
		int r = n;
		int index = 0;
		while (r < length) {
			ans[index] = nums[l];
			ans[index + 1] = nums[r];
			l++;
			r++;
			index = index + 2;
		}
		return ans;
	}
}
