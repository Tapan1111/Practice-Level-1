package LinkedList;

import java.util.Stack;

import LinkedList.FindSumOfLastNNodesGivenInALinkedList.LinkedList.Node;

public class FindSumOfLastNNodesGivenInALinkedList {
	static class LinkedList {
		static class Node
		{
			int data;
			Node next;

			public Node(int data, Node next) {
				this.data = data;
				this.next = next;
			}
		}

		static Node head;
		static int size;

		public LinkedList() {
			size = 0;
		}

		public static void add(int val) {
			if(head == null) {
				Node n = new Node(val, null);
				head = n;
				size = 1;
				return;
			}
			Node t = head;
			while (t.next != null) {
				t = t.next;
			}
			Node curr = new Node(val, null);
			t.next = curr;
			size++;
		}

		public static Node get(int idx) {
			int count = 0;
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
				count++;
			}
			return temp;

		}

		public static void remove(int idx) {
			if (idx == 0) {
				head = head.next;
				size--;
				return;
			}
			Node r = get(idx - 1);
			r.next = r.next.next;
			size--;

		}


		public static int sum(Node head, int k) {
			if(k <= 0) {
				return 0;
			}
			Stack<Integer> st = new Stack<Integer>();
			int sum = 0;
			while(head != null) {
				st.push((head.data));
				head = head.next;
			}
			while (k-- > 0) {
				sum = sum + st.peek();
				st.pop();
			}
			return sum;
		}

		public static void printIt(Node head) {
			Node t = head;
			while (t.next != null) {
				System.out.println(t.data + " ->");
				t = t.next;
			}
		}
	}

	public static void main(String[] args) {
		Node one = new Node(10, null);
		Node one1 = new Node(20, null);
		System.out.println(one.data);
		System.out.println(one1.data);



	}
}
