package Recursion;

public class ValidPallindrome {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panamaa";
		System.out.println(isPallindrome(s));

	}

	public static boolean isPallindrome(String s) {
		String str = s.replaceAll("[^a-zA-Z0-9]", "");
		String str1 = str.toLowerCase();
		return helper(str1, 0, str1.length() - 1);
	}

	private static boolean helper(String str1, int start, int end) {
		if (start >= end) {
			return true;
		}
		if (str1.charAt(start) != str1.charAt(end)) {
			return false;
		}

		return helper(str1, start + 1, end - 1);
	}

}
