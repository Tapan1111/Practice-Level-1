package ArraysFormDiffSources;

import java.util.Scanner;

public class GreatestCommmonDivisor {
	public static void main(String[] args) {
		GreatestCommmonDivisor greatestCommonDivivsor = new GreatestCommmonDivisor();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int gcd = 0;
		int on1 = n1;
		int on2 = n2;
		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
			gcd = n2;
		}
		int lcm = (n1 * n2) / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}

//	public int solution2(int n1, int n2) {
//		int gcd = 0;
//		for (int i = 0; i <= n1 && i <= n2; i++) {
//			if (n1 % i == 0 && n2 % i == 0) {
//				gcd = i;
//			}
//		}
//		return gcd;
//
//	}

}
