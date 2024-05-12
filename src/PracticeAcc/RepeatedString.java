package PracticeAcc;

public class RepeatedString {

	public static void main(String[] args) {
		String s = "aba";
		int n = 10;
		System.out.println(repeatedString(s, n));

	}

	public static int repeatedString(String s, int n) {
		int slen = s.length();
		int q = n / slen;
		int r = n % slen;
		int partialLen = (r == 0) ? 0 : r;
		int letterCount = q * getletter(s, slen) + getletter(s, partialLen);
		return letterCount;
	}


	public static int getletter(String s, int slen) {
		int count = 0;
		for (int i = 0; i < slen; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}
}
