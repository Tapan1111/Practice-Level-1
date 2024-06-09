package Recursion;

public class RodCUTTING {
	public static int rodCutting(int n, int a, int b, int c) {
		if (n == 0) {
			return 0;
		}
		if (n < 0) {
			return -1;
		}
		int res = Math.max(rodCutting(n - a, a, b, c),
				Math.max(rodCutting(n - b, a, b, c), rodCutting(n - c, a, b, c)));

		if (res == -1) {
			return -1;
		}
		return res + 1;
	}

	public static void main(String[] args) {
		System.out.println(rodCutting(23, 11, 9, 12));

	}
}
