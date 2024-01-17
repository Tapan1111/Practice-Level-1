package practice.BossCoder.forLoops;

public class OddNumber {
	public static void main(String[] args) {
		System.out.println(odd(10));

	}

	public static int odd(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		return sum;

	}
}
