package DynamicProgramming;

public class CountOfSubSetWithAGivenSum {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 8, 10 };
		int sum = 10;
		System.out.println(subsetSum(arr, sum));

	}

	public static int subsetSum(int[] nums, int sum) {
		int n = nums.length;
		int[][] t = new int[n + 1][sum + 1];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < sum + 1; j++) {
				if (i == 0) {
					t[i][j] = 1;
				}
				if (j == 0) {
					t[i][j] = 0;
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (nums[i - 1] <= j) {
					t[i][j] = t[i - 1][j - nums[i - 1]] + t[i - 1][j];
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t[n][sum];
	}
}
