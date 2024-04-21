package PatternPractice;

import java.util.ArrayList;
import java.util.List;

public class PatternAlphabet {
	public static void main(String[] args) {
//		System.out.println(solve(5));
		pattern(5);

	}

	public static List<String> solve(int n) {
		List<String> ans = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			String s = "";
			for (int j = 1; j <= i; j++) {
				String str = "" + (char) (j + 96);
				s = s.concat(str);
			}
			ans.add(s);
		}
		return ans;
	}

	public static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			int ch = 65; // 97 lowercase a
			for (int j = 1; j <= i; j++) {
				System.out.print(((char) ch));
				ch++;
			}
			System.out.println();
		}
	}

}
