package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
		System.out.println(subset2(arr));

	}

	public static List<List<Integer>> subset2(int[] arr){
		Arrays.sort(arr);
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		helper(ans, arr, new ArrayList<>(), 0);
		return ans;
	}

	private static void helper(List<List<Integer>> ans, int[] arr, ArrayList temp, int start) {
		if (ans.contains(temp))
			return;
		ans.add(new ArrayList<Integer>(temp));

		for (int i = start; i < arr.length; i++) {
			if (i > start && arr[i] == arr[i - 1]) {
				continue;
			}
			temp.add(arr[i]);
			helper(ans, arr, temp, i + 1);
			temp.remove(temp.size() - 1);

		}
	}

}
