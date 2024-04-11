package Recursion;

public class CountZeroes {
	public static void main(String[] args) {
		int n = 4050607;
		System.out.println(countZeroes(n));

	}

	public static int countZeroes(int n) {
		return helper(n, 0);
	}

	private static int helper(int n, int count) {
		if (n == 0) {
			return count;
		}
		if (n % 10 == 0) {
			return helper(n / 10, count + 1);
		}

		return helper(n / 10, count);
	}

}
