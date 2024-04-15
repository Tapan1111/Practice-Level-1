package Hashing;

import java.util.HashMap;
import java.util.Map;

public class BasicOperation {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
//		System.out.println(map);
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		hmap.put('A', 5);
		hmap.put('E', 11);
		hmap.put('D', 9);
		System.out.println(hmap);

	}

}
