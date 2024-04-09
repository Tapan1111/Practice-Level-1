package Recursion;

public class SumOfFirstnNumbera {
	public static void main(String[] args) {
		System.out.println(factorialOfANumber(6));
	}

	public static int firstNSum(int n) {
		if (n == 0) {
			return n;
		}

		return n + firstNSum(n - 1);
	}

	public static int factorialOfANumber(int n) {
		if (n <= 1) {
			return n;
		}

		return n * factorialOfANumber(n - 1);
	}

}
