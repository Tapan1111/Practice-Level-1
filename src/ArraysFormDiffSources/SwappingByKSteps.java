package ArraysFormDiffSources;

import java.util.Arrays;

public class SwappingByKSteps {
	public static void main(String[] args) {
		SwappingByKSteps array = new SwappingByKSteps();
		int[] arr = { 1, 2, 3, 4, 5 };
//		int a = 0;
//		int b = arr.length - 1;
		int k = 101;
		int[] res = array.rotateInPlace(arr, k);
		System.out.println(Arrays.toString(res));
	}

//	public int[] reverseByK(int[] arr, int k) {
//		int n = arr.length;
//		k = k % n;
//		int[] ans = new int[n];
//		int idx = 0;
//		for (int i = n - k; i < n; i++) {
//			ans[idx++] = arr[i];
//
//		}
//		for (int i = 0; i < n - k; i++) {
//			ans[idx++] = arr[i];
//		}
//		return ans;
//	}


	public int[] reverse(int[] arr, int a, int b) {
		while (a < b) {
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			a++;
			b--;
		}

		return arr;
	}

	public int[] rotateInPlace(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverse(arr, n - k, n - 1);
		reverse(arr, 0, n - k - 1);
		reverse(arr, 0, n - 1);
		return arr;
	}

}
