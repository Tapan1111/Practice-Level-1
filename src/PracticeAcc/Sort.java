package PracticeAcc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] arr = new int[arraySize];
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for (int i = 0; i < arraySize; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arraySize; i++) {
			if (i % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}
		System.out.println(even);
		System.out.println(odd);

		Collections.sort(even);
		Collections.sort(odd);
		System.out.println(even);
		System.out.println(odd);

		int evenSec = even.get(even.size() - 2);
		int oddSec = odd.get(odd.size() - 2);
		int ans = evenSec + oddSec;
		System.out.println(ans);

	}

}
