package practice.BossCoder.strings;

public class IsPallindrom {
	public static void main(String[] args) {
		String str = "malyalam";
		char[] arr = str.toCharArray();
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			if (arr[s] == arr[e]) {
				System.out.println("isPallindrome");
				break;
			} else {
				System.out.println("no bro its not a pallindrome");
				break;
			}

		}
		s++;
		e--;

	}

}
