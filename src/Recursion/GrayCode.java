package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GrayCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE DIGIT");
		int n = sc.nextInt();
		ArrayList<String> ans = solution(n);
		for (String str : ans) {
			for (int i = 0; i < str.length(); i++) {
				System.out.println(str.charAt(i));
			}
			System.out.println();
		}
	}

	private static ArrayList<String> solution(int n) {
		if (n == 1) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("0");
			baseResult.add("1");
			return baseResult;
		}

		ArrayList<String> res = solution(n - 1);
		ArrayList<String> myres = new ArrayList<String>();
		for (int i = 0; i < res.size(); i++) {
			String resStr = res.get(i);
			myres.add("0" + resStr);
		}
		for (int i = res.size() - 1; i >= 0; i--) {
			String resStr = res.get(i);
			myres.add("1" + resStr);
		}
		return myres;
	}

}
