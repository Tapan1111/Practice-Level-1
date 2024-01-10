package PepCoding;

import java.util.Arrays;

public class PassingFunction {
	public static void main(String[] args) {
		int[] nums = { 2, 45, 6, 78 };
		System.out.println(Arrays.toString(nums));
		change(nums);

		System.out.println(Arrays.toString(nums));

	}

	static void change(int[] arr) {
		arr[1] = 99;
	}

}
