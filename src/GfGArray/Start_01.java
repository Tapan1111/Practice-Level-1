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

	public static boolean checkIfSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static int removeDuplicate(int[] arr) {
		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
			}
		}

		return res;
	}

	public static void moveZeros(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] != 0) {
				swap(arr[i], arr[i + 1]);
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	private static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

	public static void main(String[] args) {
//		int[] arr = { 3, 8, 12, 15, 12, 15, 16 };
		int[] arr = { 2, 4, 6, 0, 8, 0 };
//		System.out.println(del(arr, 12));
//		del(arr, 5);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(largestElement(arr));
//		System.out.println(secondLargetEfficient(arr));
//		System.out.println(checkIfSorted(arr));
//		reverse(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(removeDuplicate(arr));
		moveZeros(arr);
//		System.out.println(Arrays.toString(arr));

	}

}
