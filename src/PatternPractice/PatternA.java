package PatternPractice;

import java.util.ArrayList;
import java.util.List;

public class PatternA {
	public static void main(String[] args) {
		PatternA pattern = new PatternA();
		int n = 4;
		System.out.println(pattern.solve(n));

	}

	public List<String> solve(int n) {
		ArrayList<String> ans = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j <= i; j++) {
				sb = sb.append(j);
			}
			ans.add(sb.toString());
		}
		return ans;
	}

}
