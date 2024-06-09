package Recursion;

public class GfgSubset {
	public static void subset(String s) {

		helper(s, "", 0);
	}

	private static void helper(String s, String curr, int i) {
		if (i == s.length()) {
			System.out.println(curr);
			return;
		}
		helper(s, curr, i + 1);
		helper(s, curr + s.charAt(i), i + 1);

	}

	public static void main(String[] args) {
		String s = "abc";
		subset(s);

	}
}
