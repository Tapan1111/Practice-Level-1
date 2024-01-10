package Collections;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		Anagrams ana = new Anagrams();
		ana.areAnagrams("Silent", "Listen");
		System.out.println(ana.areAnagrams("Silent", "Listen"));
	}

	public boolean areAnagrams(String str1, String str2) {
		if (str1 == null || str2 == null) {
			return false;
		}
		if (str1.length() != str2.length()) {
			return false;
		}

		String lowerCase1 = str1.toLowerCase();
		String lowerCase2 = str2.toLowerCase();

		char[] c1 = lowerCase1.toCharArray();
		char[] c2 = lowerCase2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);

	}

}
