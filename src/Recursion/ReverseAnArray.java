package Recursion;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		reverseArray(arr);

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void reverseArray(int[] arr) {

		int[] ans = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			ans[arr.length - i - 1] = arr[i];
		}
		printArray(ans);
	}

}
