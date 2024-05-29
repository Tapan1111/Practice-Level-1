package PracticeAcc;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "java docs";
		reverseWords(str);
	}

	public static void find(String str) {
		for (int i = 0; i < str.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

	public static void findFirstCharacter(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (map.get(ch) == 1) {
//				System.out.println(ch);
//				break;
//			}
//		}

	}

	public static void reverseWords(String str) {
		String[] arr = str.split(" ");
		String output = "";
		for (String word : arr) {
			String rev = " ";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			output = output + rev + "";
		}
		System.out.println(output);
	}
}
