package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(solve(arr));

	}

	public static int longestIncreasingSubsequenceCount(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n];
		dp[0] = 1;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					if (dp[j] > max) {
						max = dp[j];
					}
				}
				dp[i] = max + 1;
			}
		}
		for (int i = 0; i < dp.length; i++) {
			ans = Math.max(ans, dp[i]);
		}
		return ans;
	}

	public static int solve(int[] arr) {
		int n = arr.length;
		int dp[] = new int[n];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = 1;
		}
		System.out.println(Arrays.toString(dp));
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					dp[j] = Math.max(dp[j], 1 + dp[i]);
				}
			}
		}	
		System.out.println(Arrays.toString(dp));

		int count = 0;
		for(int i1=0; i1<dp.length; i1++) {
			count = Math.max(count, dp[i1]);
		}
		return count;
	}

}
