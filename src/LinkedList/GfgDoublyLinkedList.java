package LinkedList;

public class GfgDoublyLinkedList {
	public static class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void printDLL(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ->>");
			temp = temp.next;
		}
		System.out.println();
	}

	public static Node insertAtBegin(Node head, int data) {
		Node n = new Node(data);
		n.next = head;
		if (head != null) {
			head.prev = n;
		}
		return n;
	}

	public static Node insertAtLast(Node head, int data) {
		Node curr = new Node(data);

		if (head == null) {
			return curr;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = curr;
		curr.prev = temp;
		return head;
	}

	public static Node reverseDLL(Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			prev = curr.next;
			curr.prev = curr.next;
			curr.next = prev;
			curr = curr.prev;
		}
		return prev.prev;
	}

	public static Node delHead(Node head) {
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			return null;
		}
		head = head.next;
		head.prev = null;
		return head;
	}

	public static Node delLast(Node head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.prev.next = null;
		return head;
	}


	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		head = insertAtBegin(head, 44);
		head = insertAtLast(head, 11);
		printDLL(head);
		System.out.println();
		head = delHead(head);
		printDLL(head);
		System.out.println();
		head = delLast(head);
		printDLL(head);

	}
}
