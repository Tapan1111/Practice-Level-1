package practice.Arrays;

import java.util.Arrays;

public class SortedSquares {
	public static void main(String[] args) {
		SortedSquares solution = new SortedSquares();

		int[] arr = { -11, -2, -3, 4, 5 };
		int[] result = solution.solve(arr);
		int s = 0;
		int e = result.length - 1;
		for (int i = 0; i < result.length; i++) {
			if (result[s] > result[e]) {
				int temp = result[s];
				result[s] = result[e];
				result[e] = temp;
				s++;
				e--;
			}
		}
		System.out.println(Arrays.toString(result));

	}

	public int[] solve(int[] arr) {
		int n = arr.length;
		int s = 0;
		int e = n-1;
		int[] ans = new int[n];
		int k = n - 1;
		
		while (s <= e) {
			if(Math.abs(arr[s]) > Math.abs(arr[e])) {
				ans[k--] = arr[s] * arr[s];
				s++;
			}
			else {
				ans[k--] = arr[e] * arr[e];
				e--;
			}
		}

		return ans;
	}
}
