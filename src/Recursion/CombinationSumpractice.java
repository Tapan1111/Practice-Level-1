package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumpractice {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		int target = 7;
		System.out.println(combinationSum(arr, target));
	}

	public static List<List<Integer>> combinationSum(int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		helper(ans, arr, target, new ArrayList<Integer>(), 0);
		return ans;

	}

	private static void helper(List<List<Integer>> ans, int[] arr, int target, ArrayList<Integer> temp, int index) {
		
		if (target < 0) {
			return;
		}
		
		if(target == 0) {
			ans.add(new ArrayList<Integer>(temp));
		}
		
		for (int i = index; i < arr.length; i++) {
			temp.add(arr[i]);
			helper(ans, arr, target - arr[i], temp, i);
			temp.remove(temp.size() - 1);
		}

	}

}
