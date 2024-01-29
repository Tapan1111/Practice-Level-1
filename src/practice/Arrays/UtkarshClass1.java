package practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UtkarshClass1 {
	public static void main(String[] args) {
		int[] arr = {3,6,7,9,-11};
		System.out.println(arr[4]);
		arr[4] = 1000;
		System.out.println(Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));

		int max = array[0];
		int min = array[0];
		for (int val : array) {
			if (val > max) {
				max = val;
			}
			if (val < min) {
				min = val;
			}
		}
		System.out.println("maximum number :" + max);
		System.out.println("minimum number :" + min);


	}
}
