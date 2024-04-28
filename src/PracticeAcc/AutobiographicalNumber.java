package PracticeAcc;

import java.util.Arrays;

public class AutobiographicalNumber {
	public static void main(String[] args) {
		String n = "72110";
		System.out.println(findAuto(n));
	}

	public static int findAuto(String str) {
		int[] arr = new int[10];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<str.length(); i++) {
			if (arr[i] != str.charAt(i) - '0') {
				return 0;
			}
		}
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		return count;
	}

}
