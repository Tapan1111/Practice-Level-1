package practice.BossCoder.PatternProblem;

public class Pattern7 {
	public static void main(String[] args) {
		Pattern7 ptrn = new Pattern7();
		ptrn.prob(5);

	}

	public void prob(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
