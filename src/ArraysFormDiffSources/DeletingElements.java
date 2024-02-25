package ArraysFormDiffSources;

import java.util.Arrays;

public class DeletingElements {
	public static void main(String[] args) {
		DeletingElements deleting = new DeletingElements();
		int arr[] = { 10, 50, 30, 40, 20 };
		int n = arr.length;
		int key = 30;
		n = deleting.deleteElement(arr, key, n);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));

	}

	public int findElement(int[] arr, int key, int n) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public int deleteElement(int[] arr, int key, int n) {
		int pos = findElement(arr, key, n);
		if (pos == -1) {
			System.out.println("Element not found");
			return n;
		}
		for (int i = pos; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		return n - 1;
//		for (int i = 0; i < n; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));
	}

}
