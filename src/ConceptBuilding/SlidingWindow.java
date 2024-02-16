package ConceptBuilding;

public class SlidingWindow {
	public static void main(String[] args) {
		SlidingWindow sliding = new SlidingWindow();
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		System.out.println(sliding.maxSum(arr, k));
	}

	public int maxSum(int[] arr, int k) {
		int ans = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum = sum+arr[i]-arr[i-k];
			ans = Math.max(sum, ans);
		}
		return sum;
	}
}
