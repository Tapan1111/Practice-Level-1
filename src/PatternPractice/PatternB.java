package PatternPractice;

public class PatternB {
	public static void main(String[] args) {
		PatternB pattern = new PatternB();
		int n = 4;
		pattern.solveAgain(n);

	}

//	public List<String> solve(int n) {
//		ArrayList<String> ans = new ArrayList<String>();
//		for (int i = 0; i < n; i++) {
//			String s = "";
//			for (int j = n; j <= i; j--) {
//				s = s.concat("*");
//			}
//			ans.add(s);
//		}
//		return ans;
//	}

	public void solveAgain(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
