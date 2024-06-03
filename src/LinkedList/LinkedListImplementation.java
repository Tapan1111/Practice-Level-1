package LinkedList;

public class LinkedListImplementation {
	class LinkedList {
		class Node {
			int data;
			Node next;

			public Node(int data, Node next) {
				this.data = data;
				this.next = next;
			}
		}

		Node head;
		int size;

		public LinkedList() {
			size = 0;
		}

		public void add(int val) {
			if (head == null) {
				Node t = new Node(val, null);
				head = t;
				size = 1;
				return;
			}
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			Node n = new Node(val, null);
			temp.next = n;
			size++;
		}
		public Node get(int idx) {
			Node temp = head;
			int count = 0;
			while (count < idx) {
				temp = temp.next;
				count++;
			}
			return temp;
		}
	}


	public static void main(String[] args) {

	}

}
