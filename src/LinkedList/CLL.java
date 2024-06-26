package LinkedList;

public class CLL {

	private Node head;
	private Node tail;

	public CLL() {
		this.head = null;
		this.tail = null;
	}

	public void delete(int value) {
		Node node = head;
		if (node == null) {
			return;
		}
		if (node.val == value) {
			head = head.next;
			tail.next = head;
			return;
		}

		do {
			Node n = node.next;
			if (n.val == value) {
				node.next = n.next;
				break;
			}
			node = node.next;
		} while (node != head);
	}

	public void insert(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;

	}

	public void display() {
		Node temp = head;
		if(head != null) {
			do {
				System.out.print(temp.val + "->");
				temp = temp.next;
			} while (temp != head);
		}
		System.out.println();
	}

	private class Node {
		private int val;
		private Node next;

		public Node(int val) {
			this.val = val;
		}
	}

}
