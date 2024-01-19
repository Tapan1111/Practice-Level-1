package practice.BossCoder.PatternProblem;

public class Pattern10 {
	public static void main(String[] args) {
		Pattern10 ptrn = new Pattern10();
		ptrn.problemPattern10(5);

	}

	public void problemPattern10(int n) {
		for(int i=0; i<2*n-1; i++) {
			int star = i+1;
			if(i>=n) {
				star = 2*n-i-1;
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
