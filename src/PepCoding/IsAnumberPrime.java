package PepCoding;

import java.util.Scanner;

public class IsAnumberPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();

			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Prime");
			} else {
				System.out.println("not prime");
			}
		}


	}

}
