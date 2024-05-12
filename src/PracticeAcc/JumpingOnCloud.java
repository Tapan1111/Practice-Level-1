package PracticeAcc;

public class JumpingOnCloud {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 };
		System.out.println(jumpcount(arr));
	}

	public static int jumpcount(int[] arr) {
		int count = -1;
		for (int i = 0; i < arr.length;) {
			if (i + 2 < arr.length && arr[i + 2] == 0) {
				i = i + 2;
			} else {
				i++;
			}
			count++;
		}
		return count;
	}

}
