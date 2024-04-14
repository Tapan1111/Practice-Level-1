package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		System.out.println(combine(n, k));

	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		backtrack(ans, n, k, new ArrayList<Integer>(), 1);
		return ans;
	}

	private static void backtrack(List<List<Integer>> ans, int n, int k, ArrayList<Integer> temp, int idx) {

		if (temp.size() == k) {
			ans.add(new ArrayList<Integer>(temp));
			return;
		}
		if (idx > n) {
			return;
		}


		temp.add(idx);
		backtrack(ans, n, k, temp, idx + 1);
		temp.remove(temp.size() - 1);
		backtrack(ans, n, k, temp, idx + 1);

	}

}
