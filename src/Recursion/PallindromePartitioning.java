package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PallindromePartitioning {
	public static void main(String[] args) {
		String s = "aab";
		System.out.println(partition(s));

	}

	public static List<List<String>> partition(String s) {
		List<List<String>> ans = new ArrayList<List<String>>();
		helper(ans, s, new ArrayList<String>());
		return ans;
	}

	private static void helper(List<List<String>> ans, String s, ArrayList<String> temp) {
		if (s.isEmpty()) {
			ans.add(new ArrayList<String>(temp));
			return;
		}

		for (int i = 1; i <= s.length(); i++) {
			String prefix = s.substring(0, i);
			String remaining = s.substring(i);
			if (isPallindrom(prefix)) {
				temp.add(prefix);
				helper(ans, remaining, temp);
				temp.remove(temp.size() - 1);
			}

		}

	}

	private static boolean isPallindrom(String prefix) {
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
