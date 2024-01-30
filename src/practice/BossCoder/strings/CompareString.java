package practice.BossCoder.strings;

public class CompareString {
	public static void main(String[] args) {
		String str1 = "Tapan";
		String str2 = "TAPAN";
		String s = "91-9348709726";
		String[] splitrd = s.split("-");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		for (String string : splitrd) {
			System.out.println(string);
		}
		boolean isCompare = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				isCompare = false;
				break;
			}
			isCompare = true;
		}
		System.out.println(isCompare);
	}
}
