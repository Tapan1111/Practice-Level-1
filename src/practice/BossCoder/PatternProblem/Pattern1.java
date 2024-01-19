package practice.BossCoder.PatternProblem;

public class Pattern1 {
	public static void main(String[] args) {
		Pattern1 ptrn = new Pattern1();
		ptrn.patternproblem1();

	}

	public void patternproblem1() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Week" + i);
			for (int j = 1; j <= 7; j++) {
				System.out.print("Days" + j + " ");
			}
			System.out.println();
		}
	}

}
