package practice.BossCoder.PatternProblem;

public class Pattern5 {
	public static void main(String[] args) {
		Pattern5 ptrn = new Pattern5();
		ptrn.problem05(5);
	}

	public void problem05(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
