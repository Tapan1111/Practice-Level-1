package practice;

import java.util.ArrayList;
import java.util.List;

public class Pattern01 {
	public static void main(String[] args) {
		Pattern01 solution = new Pattern01();
		int n = 7;
		System.out.println(solution.code(n));
	}

	public List<String> code(int n) {
		ArrayList<String> ans = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String s = "";
			for (int j = 0; j <= i; j++) {
				s = s.concat("*");
			}
			ans.add(s);
		}
		return ans;
	}

}
