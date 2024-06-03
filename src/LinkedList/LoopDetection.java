package LinkedList;

import java.util.HashSet;

public class LoopDetection {

	static Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void addNodes(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}

	public static boolean detectLoop(Node head) {
		HashSet<Integer> set = new HashSet<Integer>();
		Node temp = head;
		while (temp.next != null) {
			if (set.contains(temp.data)) {
				return true;
			}
			set.add(temp.data);
			temp = temp.next;
		}
		return false;
	}

	public static void main(String[] args) {

	}
}
