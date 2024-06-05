package LinkedList;

import java.util.ArrayList;
import java.util.HashSet;

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

	public static Node sortedInsert(Node head, int x) {
		Node t = new Node(x);
		if (head == null) {
			return t;
		}
		if (x < head.data) {
			t.next = head;
			return t;
		}
		Node curr = head;
		while (curr.next != null && curr.next.data < x) {
			curr = curr.next;

		}
		t.next = curr.next;
		curr.next = t;
		return head;
	}

	public static void printMiddle(Node head) {
		if (head == null) {
			return;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}

	public static void printMid(Node head) {
		if (head == null) {
			return;
		}
		int count = 0;
		Node curr;
		for (curr = head; curr != null; curr = curr.next) {
			count++;
		}
		curr = head;
		for (int i = 0; i < count / 2; i++) {
			curr = curr.next;
		}
		System.out.println(curr.data);
	}

	public static void NthNodefromLast(Node head, int n) {
		int count = 0;
		Node t = head;
		while (t != null) {
			t = t.next;
			count++;
		}
		System.out.println(count);
		if (n > count) {
			return;
		}
		Node curr = head;
		for (int i = 1; i < (count - n + 1); i++) {
			curr = curr.next;
		}
		System.out.println(curr.data);

	}

	public static void NthNodeEfficient(Node head, int n) {
		Node c = head;
		int count = 1;
		while (count < n) {
			c = c.next;
			count++;
		}
		Node first = c;
		Node second = head;
		while (first != null && first.next != null) {
			first = first.next;
			second = second.next;
		}
		System.out.println(second.data);
	}

	public static Node revList(Node head) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (Node curr = head; curr != null; curr = curr.next) {
			arr.add(curr.data);
		}
		for (Node curr = head; curr != null; curr = curr.next) {
			curr.data = arr.remove(arr.size() - 1);
		}
		return head;
	}

	public static Node reverseLL(Node head) {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static Node recRev(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node rest_head = recRev(head.next);
		Node rest_tail = head.next;
		rest_tail.next = head;
		head.next = null;
		return rest_head;
	}

	public static Node recRev2(Node curr, Node prev) {
		if (curr == null) {
			return prev;
		}
		Node next = curr.next;
		curr.next = prev;
		return recRev2(next, curr);
	}

	public static boolean detectLoop(Node head) {
		Node temp = new Node(0);
		Node curr = head;
		while (curr != null) {
			if (curr.next == null) {
				return false;
			}
			if (curr.next == temp) {
				return true;
			}
			Node n = curr.next;
			curr.next = temp;
			curr = curr.next;
		}
		return false;

	}

	public static boolean DetectLoopHash(Node head) {
		HashSet<Node> set = new HashSet<>();
		for (Node curr = head; curr != null; curr = curr.next) {
			if (set.contains(curr)) {
				return false;
			}
			set.add(curr);
		}
		return false;
	}

	public static void delNode(Node ptr) {
		if (ptr == null || ptr.next == null) {
			return;
		}
		ptr.data = ptr.next.data;
		ptr.next = ptr.next.next;
	}

	public static Node swapped(Node head) {
		Node curr = head;
		while (curr.next != null) {
			int temp = curr.data;
			curr.data = curr.next.data;
			curr.next.data = temp;
			curr = curr.next.next;
		}
		return head;
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

//		System.out.println();
//		System.out.println(searchRecursive(head, 40));
//		head = delHead(head);
//		printLL(head);
//		System.out.println();
//		insertPos(head, 5, 45);
//		printLL(head);

//		System.out.println();
//		printLL(head);
//		System.out.println();
//		head = sortedInsert(head, 45);
//		printLL(head);
//		System.out.println();
//		printMiddle(head);
//		System.out.println();
//		printMid(head);
//		System.out.println();
//		NthNodefromLast(head, 2);
//		System.out.println();
//		NthNodeEfficient(head, 2);
//		Node curr = head;
//		Node prev = null;
//		head = recRev2(curr, prev);
//		System.out.println(detectLoop(head));
//		System.out.println(DetectLoopHash(head));
////		head = recRev(head);
//		Node ptr = new Node(30);
		head = swapped(head);

		printLL(head);


	}


}
