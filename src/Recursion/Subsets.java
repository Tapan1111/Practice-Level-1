package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(subset(arr));

	}

	public static List<List<Integer>> subset(int[] arr) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		helper(ans, arr, new ArrayList<>(), 0);
		return ans;
	}

	private static void helper(List<List<Integer>> ans, int[] arr, ArrayList temp, int start) {
		ans.add(new ArrayList<Integer>(temp));

		for (int i = start; i < arr.length; i++) {
			temp.add(arr[i]);
			helper(ans, arr, temp, i + 1);
			temp.remove(temp.size() - 1);
		}
	}

}
