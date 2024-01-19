package practice.BossCoder.PatternProblem;

public class Pattern8 {
	public static void main(String[] args) {
		Pattern8 ptrn = new Pattern8();
		ptrn.problems(5);

	}

	public void problems(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
