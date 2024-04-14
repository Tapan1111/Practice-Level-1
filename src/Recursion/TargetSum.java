package Recursion;

public class TargetSum {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 1 };
		System.out.println(findTargetSumWays(arr, 3));

	}

	static int count = 0;
	public static int findTargetSumWays(int[] arr, int target) {
		helper(arr, target, 0, 0);
		return count;
	}

	private static void helper(int[] arr, int target, int idx, int sum) {
		if (idx == arr.length) {
			if (sum == target) {
				count++;
			}
			return;
		}
		helper(arr, target, idx + 1, sum + arr[idx]);
		helper(arr, target, idx + 1, sum - arr[idx]);

	}

}
