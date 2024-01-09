package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class DifferentMapInterface {
	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Tapan", 1000);
		hashMap.put("Pani", 2000);
		hashMap.put("Rahul", 3000);
		hashMap.put("Jiitu", 400);
		hashMap.put("Dictionary", 5);
		System.out.println(hashMap);
		
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("Dragon", 111);
		linkedHashMap.put("Eagle", 43);
		linkedHashMap.put("Lion", 452);
		linkedHashMap.put("Panter", 345);
		linkedHashMap.put("BlackPanther", 5000);

		System.out.println(linkedHashMap);

		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("A", 1);
		treeMap.put("B", 43);
		treeMap.put("C", 3);
		treeMap.put("D", 5);
		treeMap.put("E", 50700);

		System.out.println(treeMap);
	}

}
