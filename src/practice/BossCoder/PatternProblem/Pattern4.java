package practice.BossCoder.PatternProblem;

public class Pattern4 {
	public static void main(String[] args) {
		Pattern4 ptrn = new Pattern4();
		ptrn.patternprob4(5);

	}

	public void patternprob4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
