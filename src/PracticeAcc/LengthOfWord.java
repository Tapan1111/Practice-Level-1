package PracticeAcc;

import java.util.Arrays;

public class LengthOfWord {
	public static void main(String[] args) {
		String srt = "I love my country";
		String[] arr = srt.split(" ");
		System.out.println(Arrays.toString(arr));
		int maxlen  = Integer.MIN_VALUE;
		for(String s : arr) {
			int len = s.length();
			maxlen = Math.max(maxlen, len);
		}
		System.out.println(maxlen);

	}
}
