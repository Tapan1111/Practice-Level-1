package LinkedList;

public class LL {
	
	private Node head;
	private Node tail;
	private int size;

	public LL() {
		this.size = 0;
	}

	public Node find(int val) {
		Node node = head;
		while (node != null) {
			if (node.value == val) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	public int delete(int index) {
		if (index == 0) {
			return deleteFirst();
		}
		if (index == size) {
			return deleteLast();
		}
		Node prev = get(index - 1);
		int val = prev.next.value;
		prev.next = prev.next.next;
		size--;
		return val;
	}
	public int deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}

		Node secondLast = get(size - 1);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;
		size--;
		return val;
	}

//	public int deleteLast() {
//		if (size <= 1) {
//			return deleteFirst();
//		}
//
//		Node secondLast = get(size - 2);
//		int val = tail.value;
//		secondLast.next = null;
//		tail = secondLast;
//		size--;
//		return val;
//	}
	public Node get(int index) {
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public int deleteFirst() {
		int value = head.value;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return value;
	}

	public void insertAtPosition(int value, int index) {
		if (index == 0) {
			insertFirst(value);
			return;
		}
		if (index == size) {
			insertLast(value);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;
		
	}

	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void addLast(int value) {
		if (head == null) {
			head = new Node(value, null);
			size = 1;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node node = new Node(value, null);
		temp.next = node;
		size++;
	}

	public void insertLast(int value) {
		if (tail == null) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ->");
			temp = temp.next;
		}
		System.out.println("End");

	}

	// insert using recursion.
	public void insertUsingRC(int val, int index) {
		head = insertRec(val, index, head);

	}

	private Node insertRec(int val, int index, Node node) {
		if (index == 0) {
			Node temp = new Node(val, node);
			size++;
			return temp;
		}
		node.next = insertRec(val, index--, node.next);
		return node;

	}

	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}


}
