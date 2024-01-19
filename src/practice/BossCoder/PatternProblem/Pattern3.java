package practice.BossCoder.PatternProblem;

public class Pattern3 {
	public static void main(String[] args) {
		Pattern3 ptrn = new Pattern3();
		ptrn.problemPattern(5);

	}

	public void problemPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
