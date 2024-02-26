package ArraysFormDiffSources;

import java.util.Arrays;

public class CountsOfElements {
	public static void main(String[] args) {
		CountsOfElements elements = new CountsOfElements();

		int[] arr = { 1, 4, 5, 3, 19, 3 };
		int target = 5;
		int[] result = elements.smallestAndLargest(arr);
		System.out.println(Arrays.toString(result));
		System.out.println(elements.greaterElementCount(arr, target));
		System.out.println(elements.isSorted(arr));
	}

	public int findCount(int[] arr, int target) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				count++;
			}
		}
		return count;
	}

	public int findLastIndex(int[] arr, int target) {
		int n = arr.length;
		int lastOccurance = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				lastOccurance = i;
			}
		}
		return lastOccurance;
	}

	public int greaterElementCount(int[] arr, int target) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > target) {
				count++;
			}
		}
		return count;
	}

	public boolean isSorted(int[] arr) {
		int n = arr.length;
		boolean check = true;
		for (int i = 1; i <= n; i++) {
			if (arr[i] < arr[i - 1]) {
				check = false;
				break;
			}
		}
		return check;
	}

	public int[] smallestAndLargest(int[] arr) {
		int n = arr.length;
		int[] ans = new int[2];
		int smallestElement = Integer.MAX_VALUE;
		int largestElement = Integer.MIN_VALUE;
		for (Integer val : arr) {
			smallestElement = Math.min(smallestElement, val);
			largestElement = Math.max(largestElement, val);
		}
		ans[0] = smallestElement;
		ans[1] = largestElement;

		return ans;
	}

}
