package ArraysFormDiffSources;

import java.util.Arrays;

public class KthLargestElement {
	public static void main(String[] args) {
		KthLargestElement element = new KthLargestElement();

		int arr[] = { 1, 4, 5, 3, 19, 3 };
		int k = 3;
		System.out.println(element.solution(arr, k));

	}

	public int solution(int[] arr, int k) {
		int n = arr.length;
		Arrays.sort(arr);
		return arr[n - k];
	}

}
