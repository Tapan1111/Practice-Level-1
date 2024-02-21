package practice.BossCoder.PatternProblem;

import java.util.ArrayList;
import java.util.List;

public class AplhabeticPattern {
	public static void main(String[] args) {
		AplhabeticPattern pattern = new AplhabeticPattern();
		int n = 5;
		System.out.println(pattern.solve(n));

	}

	public List<String> solve(int n) {
		ArrayList<String> ans = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String s = "";
			for (int j = 0; j <= i; j++) {
				char temp = (char) (97 + j);
				String str = "" + temp;
				s = s.concat(str);
			}
			ans.add(s);
		}
		return ans;
	}

}
