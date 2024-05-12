package PracticeAcc;

public class PallindromicIndex {
	public static void main(String[] args) {
		String s = "aabccccaa";
		System.out.println(pallindromeindex(s));

	}

	public static int pallindromeindex(String s) {
		int len = s.length();
		int palindromicINDEX = -1;
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - 1 - i)) {

				if (i + 1 < len) {
					boolean isRightStrngValidPalindrome = isValidPalindrome(s.substring(i + 1, len - i));
					if (isRightStrngValidPalindrome) {
						return i;
					}
				}
				return len - i - 1;
			}
		}
		return palindromicINDEX;
	}

	private static boolean isValidPalindrome(String str) {
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-1-i)) {
				return false;
			}
		}
		return true;
	}
}
