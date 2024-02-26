package ArraysFormDiffSources;

import java.util.Scanner;

public class TakingInput {
	public static void main(String[] args) {
		TakingInput take = new TakingInput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println();
		int[] arr2 = array.clone();
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}

		arr2[0] = 12;
		arr2[1] = 10;
		System.out.println("Copied Array----------");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();
		System.out.println("Original Array----------");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(take.isSorted(array));
	}

	public boolean isSorted(int[] arr) {
		int n = arr.length;
		boolean check = true;
		for (int i = 1; i <= n; i++) {
			if (arr[i] < arr[i - 1]) {
				check = false;
				break;
			}
		}
		return check;
	}

}
