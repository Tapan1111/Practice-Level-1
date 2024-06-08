package Recursion;

import java.util.Arrays;

public class pratice01 {


	public static void fun(int n, int k) {
		if (n == 0) {
			return;
		}
		System.out.println(k);
		fun(n - 1, k + 1);

	}

	public static int tailRecursionFact(int n, int k) {
		if(n == 0 || n == 1) {
			return k;
		}
		return tailRecursionFact(n - 1, n * k);
	}

	public static int getSum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + getSum(n - 1);
	}

	public static boolean checkPalindrom(String str, int s, int e) {
		if (s >= e) {
			return true;
		}
		return (str.charAt(s) == str.charAt(e)) && checkPalindrom(str, s + 1, e - 1);
	}

	public static int sumDigits(int n) {
		if (n <= 9) {
			return n;
		}
		return n % 10 + sumDigits(n / 10);
	}

	public static void printStr(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}
		System.out.println(Arrays.toString(count));
		for(int i=0; i<26; i++) {
			if(count[i] > 0) {
				System.out.println((char) (i + 'a') + " " + count[i]);
			}
		}
	}

	public static void leader(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] <= arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void leaderfrmLast(int[] arr) {
//		2, 6, 56, 78, 3, 89, 45
		int n = arr.length;
		int currLeader = n - 1;
		System.out.println(arr[n - 1]);
		for (int i = n - 2; i >= 0; i--) {
			if (currLeader < arr[i]) {
				currLeader = arr[i];
				System.out.println(arr[i]);
			}
		}
	}

	public static int maximumDifference(int[] arr) {
		int res = arr[1] - arr[0];
		int minVal = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				res = Math.max(res, arr[j] - arr[i]);
				minVal = Math.min(minVal, arr[j]);
			}
		}
		return res;
	}

	public static int maxDiff(int[] arr) {
		int res = arr[1]-arr[0];
		int minValue = arr[0];
		for(int j=1; j<arr.length; j++) {
			res = Math.max(res, arr[j]-minValue);
			minValue = Math.min(minValue, arr[j]);
		}
		return res;
	}

	public static int maximumIndex(int[] arr) {
		int maxDiff = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= i; j--) {
				if (arr[j] > arr[i] && maxDiff < (j - i)) {
					maxDiff = j - i;
				}
			}
		}
		return maxDiff;
	}

	public static void main(String[] args) {
//		fun(10, 1);
//		System.out.println(tailRecursionFact(5, 1));
//		System.out.println(getSum(5));
//		String str = "racecar";
//		System.out.println(checkPalindrom(str, 0, str.length() - 1));
//		System.out.println(sumDigits(873));
//		printStr(str);
		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
//		leader(arr);
//		System.out.println("+++++++++++++++++++++++++++++++++++++");
//		leaderfrmLast(arr);
//		System.out.println(maximumDifference(arr));
//		System.out.println(maxDiff(arr));
		System.out.println(maxDiff(arr));
	}
}

