package PracticeAcc;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
//		String str = "$ja!va$&st%ar";
		String str = "opentext";
		char a1 = 't';
		replaceWithCount(str, a1);
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
		Set<Character> set = new LinkedHashSet<Character>();
		for (char c : str.toCharArray()) {
			set.add(c);
		}
		for (char ch : set) {
			System.out.print(ch);
		}
	}

	public static void sortAlphabetically(String string) {
		char[] arr = string.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(new String(arr));
	}

	public static void replaceWithCount(String str, char toreplace) {
		char[] arr = str.toCharArray();
		int count = 1;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == toreplace) {
//				arr[i] = String.valueOf(count).charAt(0);
//				count++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == toreplace) {
				str = str.replaceFirst(String.valueOf(toreplace), String.valueOf(count));
				count++;
			}
		}
		System.out.println(str);
	}
}
