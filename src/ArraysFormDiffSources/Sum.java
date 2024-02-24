package ArraysFormDiffSources;

import java.util.Arrays;

public class Sum {
	public static void main(String[] args) {
		Sum runninfSum = new Sum();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] res = runninfSum.sove(arr);
		System.out.println(Arrays.toString(res));
		System.out.println(runninfSum.findMax(res));

	}

	public int[] sove(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];
		int max = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			ans[i] = sum;
			max = Math.max(sum, max);
			

		}
		System.out.println(max);
		return ans;
	}

	public int findMax(int[] res) {
		int n = res.length;
		int max = Integer.MIN_VALUE;
		for (int val : res) {
			if (val > max) {
				max = val;
			}
		}
		return max;
	}

}
