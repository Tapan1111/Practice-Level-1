package Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 7, 4, 5, 2, 3, 1, 9, 6 };
		selectiomSort(arr);

	}

	private static void selectiomSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;

		}
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

}
