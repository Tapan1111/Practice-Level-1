package PracticeAcc;

public class AngryProffesor {
	public static void main(String[] args) {
		int[] arr = { -2, -1, 0, 1, 3 };
		System.out.println(angryProffesor(3, arr));


	}

	public static String angryProffesor(int k, int[] arr) {
		String str = " ";
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				count++;
			}
			if (count >= k) {
				str = "No";
			} else {
				str = "Yes";
			}
		}
		return str;
	}
}
