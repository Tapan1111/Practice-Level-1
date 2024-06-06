package GfGArray;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static int[] moveZeros(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] != 0) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		return arr;
	}

	public static int[] movingZeros(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] != 0) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		return arr;
	}

	public static int[] moveZero2(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 5, 0, 8, 0 };
		int res[] = moveZero2(arr);
		System.out.println(Arrays.toString(res));

	}

}
