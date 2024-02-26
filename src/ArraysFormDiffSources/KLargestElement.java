package ArraysFormDiffSources;

import java.util.PriorityQueue;

public class KLargestElement {
	public static void main(String[] args) {
		KLargestElement kthLargest = new KLargestElement();
		int[] arr = { 40, 3, 23, 42, 34, 8, 17 };
		int k = 5;
		// System.out.println(kthLargest.kthLargestElement(arr, k));
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (i < k) {
				pq.add(arr[i]);
			} else {
				if (arr[i] > pq.peek()) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}
		while (!pq.isEmpty()) {
			System.out.println(pq.peek());
			break;
		}

	}

//	public int kthLargestElement(int[] arr, int k) {
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		for (int i = arr.length - 1; i >= 0; i--) {
//			pq.add(arr[i]);
//		}
//		int l = k - 1;
//		while (l > 0) {
//			pq.poll();
//			l = l - 1;
//		}
//		return pq.peek();
//	}

}
