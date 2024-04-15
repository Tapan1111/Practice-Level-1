package Hashing;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
	public static void main(String[] args) {
		int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(countLngestSubsequence(arr));
	}

	public static int countLngestSubsequence(int[] arr) {
		Arrays.sort(arr);
		int maxLength = 1;
		int currenLength = 1;
		if (arr.length == 0 | arr == null) {
			return 0;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				if (arr[i] == arr[i - 1] + 1) {
					currenLength++;
				} else {
					maxLength = Math.max(maxLength, currenLength);
					currenLength = 1;
				}
			}
		}
		return Math.max(maxLength, currenLength);
	}

}
