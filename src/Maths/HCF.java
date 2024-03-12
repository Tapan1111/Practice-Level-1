package Maths;

public class HCF {
	public static void main(String[] args) {
		int a = 25;
		int b = 20;
		System.out.println(solveGcd(a, b));

	}

	public static int gcd(int a, int b) {
		int ans = 1;
		for (int i = 2; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				ans = i;
			}
		}
		return ans;
	}

	public static int solveGcd(int a, int b) {
		int rem = a % b;
		while (rem != 0) {
			a = b;
			b = rem;
			rem = a % b;
		}
		return b;

	}

}
