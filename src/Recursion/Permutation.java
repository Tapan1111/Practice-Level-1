package Recursion;

import java.util.ArrayList;

public class Permutation {
	public static void main(String[] args) {
		subsetvoid("abc", " ");

	}

	public static ArrayList<String> subset(String filled) {
		ArrayList<String> ans = new ArrayList<String>();
		helper(ans, filled, " ");
		return ans;
	}

	private static void helper(ArrayList<String> ans, String filled, String empty) {
		if (filled.isEmpty()) {
			ans.add(empty);
			return;
		}
		char ch = filled.charAt(0);
		helper(ans, filled.substring(1), empty + ch);

	}

	public static void subsetvoid(String filled, String empty) {
		if (filled.isEmpty()) {
			System.out.println(empty);
			return;
		}
		for (int i = 0; i < filled.length(); i++) {
			char ch = filled.charAt(i);
			String nfilled = filled.substring(0, i) + filled.substring(i + 1);
			subsetvoid(nfilled, empty + ch);
		}

	}

}
