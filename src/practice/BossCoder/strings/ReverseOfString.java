package practice.BossCoder.strings;

public class ReverseOfString {
	public static void main(String[] args) {
		String str = "This is Tapan Behera";
		String[] arr = str.split(" ");
		String rev = "";
		for (int i = 0; i < arr.length; i++) {
			rev = arr[i] + " " + rev;
		}
		System.out.println(rev);
	}
}
