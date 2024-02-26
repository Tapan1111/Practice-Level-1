package ArraysFormDiffSources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementApproach2 {
	public static void main(String[] args) {
		KthLargestElementApproach2 approach2 = new KthLargestElementApproach2();
		int[] arr = { 40, 3, 23, 42, 34, 8, 17 };
		int k = 5;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (Integer i : arr) {
			ans.add(i);
		}
		System.out.println(ans);
		System.out.println();
		System.out.println("this is the answer " + approach2.kthLargestElement(ans, k));

	}

	public int kthLargestElement(ArrayList<Integer> ans, int k) {
		int n = ans.size();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		System.out.println();
		for (int i = 0; i < n; i++) {
			pq.add(ans.get(i));
		}
		System.out.println(pq);
		int l = k - 1;
		while (l > 0) {
			pq.poll();
			l = l - 1;
		}
		return pq.peek();
	}

}
