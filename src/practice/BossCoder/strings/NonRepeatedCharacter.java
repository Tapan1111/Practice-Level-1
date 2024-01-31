package practice.BossCoder.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedCharacter {
	public static void main(String[] args) {
		char c = getFirstNonRepeatedCharacter("abbccdeaa..");
		System.out.println(c);

	}

	public static char getFirstNonRepeatedCharacter(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(str.length());
		for (char ch : str.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeating character");
	}
}
