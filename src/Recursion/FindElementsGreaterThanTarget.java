package Recursion;

import java.util.ArrayList;

public class FindElementsGreaterThanTarget {
	public static void main(String[] args) {
		int[] arr = { 44, 61, 34, 7, 89, 4, 5, 7, 0 };
		System.out.println(solve(arr, 43));
	}

	public static ArrayList<Integer> solve(int[] arr, int target) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		helper(arr, target, 0, ans);
		return ans;
	}

	private static void helper(int[] arr, int target, int index, ArrayList<Integer> ans) {
		if (index == arr.length) {
			return;
		}
		if (arr[index] > target) {
			ans.add(index);
		}
		helper(arr, target, index + 1, ans);

	}

}
