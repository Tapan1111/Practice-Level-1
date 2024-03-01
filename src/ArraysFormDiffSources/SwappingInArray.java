package ArraysFormDiffSources;

import java.util.Arrays;

public class SwappingInArray {
	public static void main(String[] args) {
		SwappingInArray arrSwap = new SwappingInArray();

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] res = arrSwap.swapReverse(arr);
		System.out.println(Arrays.toString(res));
	}

//	public int[] reverse(int[] arr) {
//		int[] ans = new int[arr.length];
//		int idx = 0;
//		for (int i = arr.length - 1; i >= 0; i--) {
//			ans[idx++] = arr[i];
//		}
//		return ans;
//	}

	public int[] swapReverse(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			swap(arr, s, e);
			s++;
			e--;

		}
		return arr;
	}

	public void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}
}
