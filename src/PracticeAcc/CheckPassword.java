package PracticeAcc;

public class CheckPassword {
	public static void main(String[] args) {
		String s = "Tap1n";
		System.out.println(checkPassword(s));

	}

	public static int checkPassword(String s) {

		if (s.length() < 4) {
			return 0;
		}
		if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
			return 0;
		}
		int num = 0;
		int cap = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' || s.charAt(i) == '/') {
				return 0;
			}
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				cap++;
			}
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				num++;
			}

		}
		if (cap > 0 && num > 0) {
			return 1;
		}
		return 0;
	}
}
