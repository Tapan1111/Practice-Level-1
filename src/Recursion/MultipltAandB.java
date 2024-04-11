package Recursion;

public class MultipltAandB {
	public static void main(String[] args) {
		System.out.println(power(2, 5));

	}

	public static int multiply(int a, int b) {
		if (b == 0) {
			return b;
		}

		return multiply(a, b - 1) + a;
	}

	public static int power(int a, int b) {

		if (b == 0) {
			return 1;
		}

		return a * power(a, b - 1);
	}

}
