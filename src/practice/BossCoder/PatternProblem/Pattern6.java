package practice.BossCoder.PatternProblem;

public class Pattern6 {
	public static void main(String[] args) {
		Pattern6 ptrn = new Pattern6();
		ptrn.patternprob06(5);

	}

	public void patternprob06(int m) {
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
