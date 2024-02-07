package PepCoding;

import java.util.Arrays;

public class Prime {
	public static void main(String[] args) {
		int n = 315;

		Prime prime = new Prime();
		int[] answer = prime.solve(n);
		System.out.println(Arrays.toString(answer));

	}

	public static int[] solve(int n) {
		int[] ans = new int[3];
		int index = 0;
		for (int i = 2; i < n; i++) {

			while (n % i == 0) {
				n = n / i;
				ans[index] = i;
				index++;

			}

		}
		return ans;


	}

}
