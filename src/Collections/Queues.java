package Collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {

		return Integer.compare(value1.length(), value2.length());
	}

}

public class Queues {


	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Dinosaurs", "Mammoths", "Dragons", "Unicorns"));

		System.out.println(queue);

		queue.poll();
//		System.out.println(queue);
	}

}
