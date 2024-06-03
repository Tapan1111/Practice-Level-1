package LinkedList;

public class CircularLinkedListGfg {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void printCLL(Node head) {
		if (head == null) {
			return;
		}
		System.out.print(head.data + "->>>");
		for (Node p = head.next; p != head; p = p.next) {
			System.out.print(p.data + "->>>");
		}
		System.out.println();
	}

	public static void printMethod2(Node head) {
		Node curr = head;
		if(head == null) {
			return;
		}
		do {
			System.out.print(curr.data+" ->");
			curr = curr.next;
		} while (curr != head);
	}

	public static Node insertBegin(Node head, int x) {
		Node n = new Node(x);
		if (head == null) {
			n.next = n;
		} else {
			Node curr = head;
			while (curr.next != head) {
				curr = curr.next;
			}
			curr.next = n;
			n.next = head;

		}
		return n;
	}

	public static Node addAtFirstEfficient(Node head, int x) {
		Node n = new Node(x);
		if (head == null) {
			n.next = n;
			return n;
		} else {
			n.next = head.next;
			head.next = n;
			int t = head.data;
			head.data = n.data;
			n.data = t;
			return head;
		}
	}

	public static Node insertAtEnd(Node head, int x) {
		Node n = new Node(x);
		if (head == null) {
			n.next = n;
			return n;
		} else {
			Node curr = head;
			while (curr.next != head) {
				curr = curr.next;
			}
			curr.next = n;
			n.next = head;
			return head;
		}
	}

	public static Node insertEndEfficient(Node head, int x) {
		Node n = new Node(x);
		if (head == null) {
			n.next = n;
			return n;
		} else {
			n.next = head.next;
			head.next = n;
			int t = head.data;
			head.data = n.data;
			n.data = t;
			return n;
		}
	}

	public static Node delHead(Node head) {
		if (head == null || head.next == head) {
			return null;
		}
		Node curr = head;
		while (curr.next != head) {
			curr = curr.next;
		}
		curr.next = head.next;
		return curr.next;
	}

	public static Node delHeadEfficient(Node head) {
		if (head == null || head.next == head) {
			return null;
		} else {
			head.data = head.next.data;
			head.next = head.next.next;
			return head;
		}
	}

	public static Node delKth(Node head, int k) {
		if (head == null) {
			return null;
		}
		if (k == 1) {
			return delHead(head);
		}
		Node curr = head;
		for (int i = 0; i < k - 2; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return head;
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = head;
		head = insertBegin(head, 55);
		head = addAtFirstEfficient(head, 81);
		head = insertAtEnd(head, 33);
		head = insertEndEfficient(head, 77);
		head = addAtFirstEfficient(head, 11);
		head = delHead(head);
		head = delHeadEfficient(head);
		head = delKth(head, 4);
		printMethod2(head);
	}

}
