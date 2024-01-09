package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {

		Set<String> set = Set.of("Apple", "Banana", "Cat", "Elephant");
		System.out.println(set);

		Set<String> hashset = new HashSet<String>(set);
		for (String hs : hashset) {
			System.out.println(hs);

		}
		
		Iterator<String> hst = hashset.iterator();
		while (hst.hasNext()) {
			System.out.println(hst.next());
		}
	}

}
