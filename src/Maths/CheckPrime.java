package Maths;

public class CheckPrime {
	public static boolean checkPrimee(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void printprimeFactor(int n) {
		for (int i = 2; i <= n; i++) {
			if (checkPrimee(i)) {
				int x = i;
				while (n % x == 0) {
					System.out.println(i);
					x = x * i;
				}
			}
		}
	}

	public static void efficientMethodPrimeFactorization(int n) {
		if (n <= 1) {
			return;
		}
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
		}
		if (n > 1) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		System.out.println(checkPrimee(13));
//		printprimeFactor(12);
		efficientMethodPrimeFactorization(450);
	}
}
