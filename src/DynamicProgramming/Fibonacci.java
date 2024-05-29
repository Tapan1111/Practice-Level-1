package DynamicProgramming;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fib(31));
	}

	public static int fib(int n) {
		int dp[] = new int[n + 1];
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		dp[n] = fib(n - 1) + fib(n - 2);
		return dp[n];
	}

}
