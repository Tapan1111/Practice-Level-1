package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permmutation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(permute(arr));

	}

	public static List<List<Integer>> permute(int[] arr) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		helper(ans, arr, new ArrayList<Integer>());
		return ans;
	}

	private static void helper(List<List<Integer>> ans, int[] arr, ArrayList<Integer> used) {
		if (used.size() == arr.length) {
			ans.add(new ArrayList<Integer>(used));
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (!used.contains(arr[i])) {
				used.add(arr[i]);
				helper(ans, arr, used);
				used.remove(used.size() - 1);
			}
		}

	}

}
