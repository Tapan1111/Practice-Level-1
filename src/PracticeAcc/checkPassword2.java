package PracticeAcc;

public class checkPassword2 {
	public static void main(String[] args) {
		String str = "4ap123";
		char[] ch = str.toCharArray();
		int min = 4;
		System.out.println(checkPass(ch, min));

	}

	public static int checkPass(char[] str, int min) {
		if (str.length < min) {
			return 0;
		}
		if (str[0] - '0' >= 0 && str[0] - '9' <= 9) {
			return 0;
		}
		int num = 0;
		int cap = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == ' ' || str[i] == '+') {
				return 0;
			}
			if (str[i] - '0' >= 0 && str[i] - '9' <= 9) {
				num++;
			}
			if (str[i] >= 'A' && str[i] <= 'Z') {
				cap++;
			}
		}
		if (num > 0 && cap > 0) {
			return 1;
		}
		return 0;
	}

}
