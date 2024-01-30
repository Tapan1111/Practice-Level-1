package practice.BossCoder.strings;

public class PrintEvenLengthWord {
	public static void main(String[] args) {
		String str = "Hell World eleven is here";
		String str1 = "1115";
		String str2 = "2222";
		int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
		System.out.println(sum);
		System.out.println();
		System.out.println(String.valueOf(sum));
		System.out.println();
		for (String string : str.split(" ")) {
			if (string.length() % 2 == 0) {
				System.out.println(string);
			}
		}
	}

}
