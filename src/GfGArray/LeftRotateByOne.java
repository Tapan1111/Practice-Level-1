package GfGArray;

import java.util.Arrays;

public class LeftRotateByOne {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
//		int[] res = leftRotate(arr);
//		int[] res1 = leftRotateByD(arr, 3);
//		System.out.println(Arrays.toString(res));
//		System.out.println(Arrays.toString(res1));
		rotateLeft(arr, 3);

	}

	public static int[] leftRotate(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		return arr;
	}

	public static int[] leftRotateByD(int[] arr, int d) {
		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		System.out.println(Arrays.toString(temp));
		for (int i = d; i < arr.length; i++) {
			arr[i - d] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < d; i++) {
			arr[arr.length - d] = temp[i];
		}
		System.out.println(Arrays.toString(temp));
		return arr;
	}

	public static void rotateLeft(int[] arr, int d) {
		int n = arr.length;
		reverse(arr, 0, d - 1);
		System.out.println(Arrays.toString(arr));
		reverse(arr, d, n - 1);
		System.out.println(Arrays.toString(arr));
		reverse(arr, 0, n - 1);
		System.out.println(Arrays.toString(arr));

	}

	public static void reverse(int[] arr, int low, int high) {
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
}
