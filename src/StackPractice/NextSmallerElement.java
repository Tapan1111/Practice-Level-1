package StackPractice;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
	public static void main(String[] args) {
		int[] arr = { 4, 8, 5, 2, 25 };
		int[] res = nse(arr);
		System.out.println(Arrays.toString(res));
	}

	public static int[] nse(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
				ans[stack.pop()] = arr[i];

			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		return ans;
	}

}
