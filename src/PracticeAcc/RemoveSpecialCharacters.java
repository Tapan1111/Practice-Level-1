package PracticeAcc;

import java.util.HashSet;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
//		String str = "$ja!va$&st%ar";
		String str = "Programming";
		removeDuplicate2(str);
	}

	public static void remove(String str) {
		String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newStr);
	}

	public static void removeDuplicate(String s) {
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);

	}

	public static void removeDuplicate2(String str) {
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		for (char c : str.toCharArray()) {
			set.add(c);
		}
		for (char ch : set) {
			System.out.print(ch);
		}
		
	}
}
