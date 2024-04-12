package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PallindromePartitionin {
	public static void main(String[] args) {
		String s = "abaaba";
		System.out.println(pallindromePartitioning(s));
		
	}

	public static List<List<String>> pallindromePartitioning(String s) {
		List<List<String>> ans = new ArrayList<>();
		helper(ans, new ArrayList<String>(), s);
		return ans;
	}

	private static void helper(List<List<String>> ans, List<String> currentPartition, String s) {
		if (s.isEmpty()) {
			ans.add(new ArrayList<String>(currentPartition));
			return;
		}
		for (int i = 1; i <= s.length(); i++) {
			String prefix = s.substring(0, i);
			String remaining = s.substring(i);
			if (isPallindrome(prefix)) {
				currentPartition.add(prefix);
				helper(ans, currentPartition, remaining);
				currentPartition.remove(currentPartition.size() - 1);
			}
		}

	}

	private static boolean isPallindrome(String prefix) {
		int start = 0;
		int end = prefix.length() - 1;
		while (start < end) {
			if (prefix.charAt(start) != prefix.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;

	}

}
