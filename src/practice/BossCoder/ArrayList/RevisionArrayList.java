package practice.BossCoder.ArrayList;

import java.util.ArrayList;

public class RevisionArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> scores = new ArrayList<Integer>();
		scores.add(34);
		scores.add(65);
		scores.add(78);
		scores.add(99);
		scores.add(100);

		System.out.println(scores.size());
		System.out.println(scores);

		scores.remove(1);
		System.out.println(scores);

		scores.set(1, 108);
		System.out.println(scores);
		System.out.println(scores.get(1));
	}

}
