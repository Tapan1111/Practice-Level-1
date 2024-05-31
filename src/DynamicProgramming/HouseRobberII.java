package DynamicProgramming;

public class HouseRobberII {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 2 };
		System.out.println(rob(arr));

	}

	public static int rob(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n + 1];
		if (n == 1) {
			return nums[0];
		}
		if (n == 2) {
			return Math.max(nums[0], nums[1]);
		}
		for (int i = 0; i < n; i++) {
			dp[i] = -1;
		}

		int steal = solve(nums, 0, n - 2, dp);
		for (int i = 0; i < n; i++) {
			dp[i] = -1;
		}
		int skip = solve(nums, 1, n - 1, dp);
		return Math.max(steal, skip);

	}

	private static int solve(int[] nums, int i, int n, int[] dp) {
		if (i > n) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int steal = nums[i] + solve(nums, i + 2, n, dp);
		int skip = solve(nums, i + 1, n, dp);
		return dp[i] = Math.max(steal, skip);
	}

}
