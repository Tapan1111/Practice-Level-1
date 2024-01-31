package practice.BossCoder.strings;

public class PrintCharacterCount {
	public static void main(String[] args) {
		PrintCharacterCount prnt = new PrintCharacterCount();

		String str = "I love my India";
		prnt.count(str);

		String[] arr = str.split(" ");
		for (String string : arr) {
			System.out.println(string + "  " + "count :" + string.length());
		}

	}

	public static void count(String str) {
		char[] cgh = str.toCharArray();
		for (int i = 0; i < cgh.length; i++) {
			String s = "";
			while (i < cgh.length && cgh[i] != ' ') {
				s = s + cgh[i];
				i++;
			}
			if (s.length() != 0) {
				System.out.println("This is the word : " + s + "," + " this is the count :" + s.length());
			}
		}

	}
}
