package practice.BossCoder.PatternProblem;

public class Pattern12 {
	public static void main(String[] args) {
		Pattern12 ptrn = new Pattern12();
		ptrn.problemPattern(5);
	}

	public void problemPattern(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			int star = i + 1;
			if (i >= n) {
				star = 2 * n - i - 1;
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
