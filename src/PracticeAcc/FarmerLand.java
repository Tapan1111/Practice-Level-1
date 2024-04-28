package PracticeAcc;

import java.util.Arrays;

public class FarmerLand {
	public static void main(String[] args) {
		System.out.println(totalLand(3));

	}

	public static int totalLand(int n) {
		int[] arr = new int[n + 1];
		arr[0] = 1;
		for (int i = 1; i <= n; i++) {
			arr[i] = arr[i - 1] ^ i;
		}
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for(int val:arr) {
			sum = sum+val;
		}
		return sum;
	}
}
