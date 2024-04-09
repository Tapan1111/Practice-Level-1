package BinarySearch;

import java.util.Arrays;

public class AggresiveCowsPractice {
	public static void main(String[] args) {
		int[] arr = { 10, 1, 2, 5, 7 };
		System.out.println(aggresiveCowPlaced(arr, 3));

	}

	public static int aggresiveCowPlaced(int[] arr, int k) {
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length - 1];
		int left = 1;
		int right = max - min;
		int ans = -1;
		while (left <= right) {
			int mid = (left + right) / 2;
			for (int dist = 1; dist >= 0; dist--) {
				if (isPossible(arr, k, mid)) {
					ans = mid;
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return ans;
	}

	private static boolean isPossible(int[] arr, int k, int mid) {
		int placedCows = arr[0];
		int cowCount = 1;
		for (int i = 1; i < arr.length; i++) {
			if (placedCows + mid <= arr[i]) {
				placedCows = arr[i];
				cowCount++;
			}
			if (cowCount == k) {
				return true;
			}
		}
		return false;
	}

}
