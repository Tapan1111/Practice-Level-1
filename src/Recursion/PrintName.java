package Recursion;

public class PrintName {
	public static void main(String[] args) {
//		int nums = 5;
//		printMethod(1, nums);
		printNumber2(10);

	}

	public static void printMethod(int times, int num) {
		if (times > num) {
			return;
		}
		System.out.println("Tapan Behera");
		printMethod(times + 1, num);
	}

	public static void printNumber(int n) {
		if (n > 10) {
			return;
		}
		System.err.println(n);
		printNumber(n + 1);
	}

	public static void printNumber2(int n) {
		if (n == 0) {
			return;
		}
		System.err.println(n);
		printNumber2(n - 1);
	}

}
