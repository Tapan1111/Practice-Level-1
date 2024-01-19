package practice.BossCoder.forLoops;

import java.util.Scanner;

public class NumeratorDenominator {
	public static void main(String[] args) {
		int num;
		int den;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerator");
		num = sc.nextInt();
		System.out.println("Enter Denominator");
		den = sc.nextInt();

		int a, b, t, gcd;

		if (num > den) {
			a = num;
			b = den;
		} else {
			a = den;
			b = num;
		}
		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		gcd = a;
		System.out.println(num / gcd + "   " + den / gcd);
	}

}
