package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		System.out.println(combinationSum(arr, 6));

	}

	public static List<List<Integer>> combinationSum(int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		helper(ans, arr, target, new ArrayList<>(), 0);
		return ans;
	}

	private static void helper(List<List<Integer>> ans, int[] arr, int target, ArrayList temp, int start) {

		if (target == 0) {
			ans.add(new ArrayList<Integer>(temp));
		}
		if (target < 0) {
			return;
		}

		for (int i = start; i < arr.length; i++) {
			temp.add(arr[i]);
			helper(ans, arr, target - arr[i], temp, i);
			temp.remove(temp.size() - 1);
		}
	}

}
