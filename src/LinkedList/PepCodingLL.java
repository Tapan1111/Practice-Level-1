package LinkedList;

public class PepCodingLL {
	public static class Node {
		int data;
		Node next;
	}

	public static class LinkedList {
		Node head;
		Node tail;
		int size;

		public void addLast(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			if (size == 0) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = temp;

			}
			size++;
		}
	}

	public static void main(String[] args) {

	}
}
