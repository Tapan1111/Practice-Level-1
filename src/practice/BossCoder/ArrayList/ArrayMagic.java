package practice.BossCoder.ArrayList;

public class ArrayMagic {

	public boolean doesElementGreaterThan(int[] arr, int number) {
		if (arr.length == 0) {
			return false;
		}
		for (int j : arr) {
			if (j > number) {
				return true;
			}

		}
		return false;
	}

	public int findSecondLargestElement(int[] arr) {
		if (arr.length < 1) {
			return -1;
		}
		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;

		for (int value : arr) {
			if (value > largestNumber) {
				secondLargestNumber = largestNumber;
				largestNumber = value;
			} else if (value > secondLargestNumber && value != largestNumber) {
				secondLargestNumber = value;
			}
		}
		if (secondLargestNumber == Integer.MIN_VALUE)
			return -1;
		return secondLargestNumber;
	}

	public boolean isSorted(int[] arr) {
		if (arr.length <= 1) {
			return true;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				return false;
			}
		}
		return true;
	}

	public int[] reverseArray(int[] arr) {
		if (arr.length <= 1) {
			return arr;
		}

		int start = 0;
		int end = arr.length - 1;
		int[] reversedArray = new int[arr.length];
		while (start < end) {
			reversedArray[end ] = arr[start];
			reversedArray[start] =  arr[end];
			start++;
			end--;
		}

		return reversedArray;
	}
}

