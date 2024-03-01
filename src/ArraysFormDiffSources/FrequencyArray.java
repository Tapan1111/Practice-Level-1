package ArraysFormDiffSources;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyArray {
	public static void main(String[] args) {
		FrequencyArray frequencyArray = new FrequencyArray();
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] freq = makeFrequencyArray(arr);
		System.out.println(Arrays.toString(freq));
		System.out.println("Enter the number of queries:");
		int q = sc.nextInt();
		while (q > 0) {
			System.out.println("Enter the number ");
			int x = sc.nextInt();
			if (freq[x] > 0) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			q--;

		}


	}

	public static int[] makeFrequencyArray(int[] arr) {
		int[] freq = new int[10];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
}
