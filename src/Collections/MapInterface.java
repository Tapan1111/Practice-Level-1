package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {

		Map<String, Integer> mapp = Map.of("Z", 3, "Y", 5, "K", 10, "T", 7);
		System.out.println(mapp);
		
		// mapp.put("E", 99);
		System.out.println(mapp.size());
		System.out.println(mapp.get("T"));
		System.out.println(mapp.isEmpty());
		System.out.println(mapp.containsKey("T"));
		System.out.println(mapp.containsValue(99));
		System.out.println(mapp.keySet());

		Map<String, Integer> keyValueList = new HashMap<String, Integer>(mapp);
		System.out.println(keyValueList);
		keyValueList.put("E", 11);
		System.out.println(keyValueList);

//		System.out.println(mapp);
	}

}
