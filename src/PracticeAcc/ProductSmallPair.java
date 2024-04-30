package PracticeAcc;

import java.util.Arrays;
import java.util.Scanner;

public class ProductSmallPair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(check(arr, 9));

	}

	public static int check(int[] arr, int sum) {
		int ans = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + arr[i + 1] <= sum) {
				ans = arr[i] * arr[i + 1];
				break; 

			}
		}
		return ans;
	}
}
