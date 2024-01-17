package practice.BossCoder.forLoops;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		gratestCommonDivisor();

	}

	public static void gratestCommonDivisor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();

		int gcd = 0;
		for (int i = 1; i <= a && i <= b; i++) {
			if ((a % i == 0) && (b % i == 0)) {
				gcd = i;
			}
		}
		System.out.println("the divisor is : " + gcd);

	}

}
