package PracticeAcc;

import java.util.Arrays;
import java.util.HashSet;

public class FindTheNumberOfDistinctInteger {
	public static void main(String[] args) {
		int[] arr = { 5, 8, 5, 7, 8, 8, 0, 4, 5, 7, 2, 2, 4, 1, 10 };
		System.out.println(findCount(arr));

	}

	public static int findCount(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				count++;
			}
		}
		return count;
	}

	public static int findCount2(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		return set.size();
	}

	public static int findCount3(int[] arr) {
		int count = 1;
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				count++;
			}
		}
		return count;
	}

}
