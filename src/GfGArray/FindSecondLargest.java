package GfGArray;

import java.util.ArrayList;

public class FindSecondLargest {
	public static int getLargest(int[] arr) {
		int largestIdx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[largestIdx]) {
				largestIdx = i;
			}
		}
		return largestIdx;
	}

	public static int seconLargest(int[] arr) {
		int res = -1;
		int larIdx = getLargest(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[larIdx]) {
				if (res == -1) {
					res = i;
				} else if (arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		return res;
	}

	public static int secondLargest(int[] arr) {
		int largest = 0;
		int secLargst = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
				secLargst = largest;
				largest = max;
			}
		}
		return secLargst;
	}

	public static int largestAndSecondLargest(int arr[]) {
		int n = arr.length;
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				secLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secLargest && largest != arr[i]) {
				secLargest = arr[i];
			}

		}
//		ans.add(largest);
//		if (secLargest == Integer.MIN_VALUE) {
//			ans.add(-1);
//		} else {
//			ans.add(secLargest);
//		}

		return secLargest;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 20 };
		System.out.println(largestAndSecondLargest(arr));

	}
}
