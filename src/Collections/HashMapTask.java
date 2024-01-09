package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapTask {

	public static void main(String[] args) {

		String str = "This is a war and you are a warrior" + "And a warrior do not complain he wins";

		String[] strngs = str.split(" ");
		System.out.println(Arrays.toString(strngs));

		Map<String, Integer> eachWords = new HashMap<String, Integer>();

		for (String words : strngs) {
			Integer values = eachWords.get(words);
			if (values == null) {
				eachWords.put(words, 1);
			} else {
				eachWords.put(words, values + 1);
			}
		}

		System.out.println(eachWords);

		char[] characters = str.toCharArray();

		Map<Character, Integer> ansList = new HashMap<Character, Integer>();

		for (char eachcharacter : characters) {
			Integer value = ansList.get(eachcharacter);
			if (value == null) {
				ansList.put(eachcharacter, 1);
			} else {
				ansList.put(eachcharacter, value + 1);
			}
		}
		System.out.println(ansList);


	}

}
