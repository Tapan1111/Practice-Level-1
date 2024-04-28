package PracticeAcc;

public class Autobiographical2 {
	public static void main(String[] args) {
		String str = "1210";
		System.out.println(find(str));
	}

	public static int find(String str) {
		int[] arr = new int[10];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (arr[i] != str.charAt(i) - '0') {
				return 0;
			}
		}
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		return count;
	}
}
