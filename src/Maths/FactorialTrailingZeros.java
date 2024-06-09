package Maths;

public class FactorialTrailingZeros {
	public static int trailingZeroes(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		int count = 0;
		while (fact % 10 == 0) {
			count++;
			fact = fact / 10;
		}
		return count;
	}

	public static int factrotrailingZero(int n) {
		int res = 0;
		for (int i = 5; i <= n; i = i * 5) {
			res = res + n / i;
		}
		return res;
	}

	public static int gcd(int a, int b) {
		int res = Math.min(a, b);
		while (res > 0) {
			if (a % res == 0 && b % res == 0) {
				break;
			}
			res--;
		}
		return res;
	}

	public static int euclidGcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}

		}
		return a;
	}

	public static int optimalGcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return optimalGcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return (a * b) / optimalGcd(a, b);

	}
	public static void main(String[] args) {
//		System.out.println(factrotrailingZero(25));
		System.out.println(optimalGcd(91, 183));
//		System.out.println(lcm(4, 6));
	}
}
