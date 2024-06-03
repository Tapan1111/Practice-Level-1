package LinkedList;

public class GfGLinkedList {
	public static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
		}
	}

	public static void printLL(Node head) {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}

	public static void printRec(Node head) {
		if (head == null) {
			return;
		}
		System.out.print(head.data + " ->");
		printRec(head.next);
		

	}

	public static Node addAtFirst(Node head, int val) {
		Node temp = new Node(val);
		temp.next = head;
		return temp;
	}

	public static Node addAtLast(Node head, int val) {
		if (head == null) {
			Node n = new Node(val);
			return n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			Node curr = new Node(val);
			temp.next = curr;
			curr.next = null;
		}
		return head;
	}

	public static Node insertPos(Node head, int pos, int data) {
		Node temp = new Node(data);
		if (pos == 1) {
			temp.next = head;
			return temp;
		}

		Node curr = head;
		for (int i = 1; i < pos - 1 && curr != null; i++) {
			curr = curr.next;
		}

		if (curr == null) {
			System.out.println("Position out of bounds");
			return head;
		}

		temp.next = curr.next;
		curr.next = temp;
		return head;
	}

	public static Node get(Node head, int pos) {
		Node curr = new Node(pos);
		int count = 0;
		while (count < pos) {
			curr = curr.next;
		}
		return curr;
	}

	public static Node delHead(Node head) {
		if (head == null) {
			return null;
		} else {
			return head.next;
		}
	}

	public static Node delTail(Node head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}

	public static int search(Node head, int x) {
		Node t = head;
		int idx = 1;
		while (t != null) {
			if (t.data == x) {
				return idx;
			} else {
				t = t.next;
				idx++;
			}
		}
		return -1;
	}

	public static int recSearch(Node head, int x) {
		if (head == null) {
			return -1;
		}
		if (head.data == x) {
			return 1;
		}
		int res = recSearch(head.next, x);
		if (res == -1) {
			return -1;
		} else {
			return (res + 1);

		}
	}
	public static int searchRecursive(Node head, int x) {
		if (head == null) {
			return -1;
		}
		if (head.data == x) {
			return 1;
		}
		int res = search(head.next, x);
		if (res == -1)
			return -1;
		else
			return (res + 1);
	}

	public static void main(String[] args) {
		Node head = null;
		head = addAtLast(head, 10);
		head = addAtLast(head, 20);
		head = addAtLast(head, 30);
		head = addAtLast(head, 40);
		head = addAtLast(head, 50);
		printLL(head);
		System.out.println();
		System.out.println(searchRecursive(head, 40));
//		head = delHead(head);
//		printLL(head);
//		System.out.println();
//		insertPos(head, 5, 45);
//		printLL(head);
		head = delHead(head);
		System.out.println();
		printLL(head);
		delTail(head);
		System.out.println();
		printLL(head);

	}

}
