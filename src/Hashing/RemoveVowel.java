package Hashing;

import java.util.Set;

public class RemoveVowel {
	public static void main(String[] args) {
		String input = "what is your name";
		String result = removeVowels(input);
		System.out.println(result);


	}

	public static String removeVowels(String str) {
		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for (Character c : ch) {
			if (!vowels.contains(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}



}
