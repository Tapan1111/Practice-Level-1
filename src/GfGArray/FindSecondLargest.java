package GfGArray;

public class FindSecondLargest {
	public static int getLargest(int[] arr) {
		int largestIdx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[largestIdx]) {
				largestIdx = i;
			}
		}
		return largestIdx;
	}

	public static int seconLargest(int[] arr) {
		int res = -1;
		int larIdx = getLargest(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[larIdx]) {
				if (res == -1) {
					res = i;
				} else if (arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		return res;
	}

	public static int secondLargest(int[] arr) {
		int largest = 0;
		int secLargst = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
				secLargst = largest;
				largest = max;
			}
		}
		return secLargst;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 20 };
		System.out.println(secondLargest(arr));

	}
}
