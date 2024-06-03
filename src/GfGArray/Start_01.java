package GfGArray;

public class Start_01 {
	public static int del(int[] arr, int x) {
		int n = arr.length;
		int i;
		for ( i = 0; i < n; i++) {
			if (arr[i] == x) {
				break;
			}
			if (i == n) {
				return n;
			}
		}
		for (int j = i; j < n - 1; j++) {
			arr[j] = arr[j + 1];
		}
		return n - 1;

	}

	public static int largestElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				idx = i;
			}
		}
		return idx;

	}

	public static int secondLargest(int[] arr) {
		int largest = largestElement(arr);
		int res = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[largest]) {
				if (res == -1) {
					res = i;
				} else if (arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		return res;

	}

	public static int secondLargetEfficient(int[] arr) {
		int res = -1;
		int largest = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			} else if (arr[i] != arr[largest]) {
				if (res == -1 || arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 8, 12, 5, 6 };
//		System.out.println(del(arr, 12));
//		del(arr, 5);
//		System.out.println(Arrays.toString(arr));
		System.out.println(largestElement(arr));
		System.out.println(secondLargetEfficient(arr));

	}

}
