package practice.BossCoder.PatternProblem;

public class Pattern11 {
	public static void main(String[] args) {
		Pattern11 ptrn = new Pattern11();
		ptrn.problemPattern11(5);

	}

	public void problemPattern11(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
