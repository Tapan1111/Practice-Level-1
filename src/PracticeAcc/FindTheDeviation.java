package PracticeAcc;

public class FindTheDeviation {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 8, 9, 32 };
		System.out.println(findthedeviation(arr));
	}

	public static int findthedeviation(int[] arr) {
		int n = arr.length;
		int average = 0;
		for (int i = 0; i < n; i++) {
			average = average + arr[i];
		}
		average = average / n;

		int sum = 0;
		for (int val : arr) {
			sum = sum + ((val - average) * (val - average));
		}
		sum = sum / n;

		return (int) Math.sqrt(sum);
	}
}
