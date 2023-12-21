package practice.Arrays;

public class StringArrayRunner {

	public static void main(String[] args) {

		String[] str = { "Apple", "Boy", "Cat", "Dog" };

		String longestString = "";
		for (String sttr : str) {

			if (sttr.length() > longestString.length()) {
				longestString = sttr;
			}
		}
		System.out.println("Longest String :" + longestString);

		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i]);
		}
	}

}
