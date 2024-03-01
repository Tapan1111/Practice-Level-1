package ArraysFormDiffSources;

public class FirstRepeatingElement {
	public static void main(String[] args) {
		FirstRepeatingElement first = new FirstRepeatingElement();
		int[] arr = { 3, 6, 4, 6, 7, 8, 8, 7 };
		System.out.println(first.solveLastRepeating(arr));

	}

	public int solveLastRepeating(int[] arr) {
		int n = arr.length;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				if (arr[j] == arr[i]) {
					return arr[i];
				}

			}

		}
		return -1;
	}

	public int solve(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] == arr[i]) {
					return arr[i];
				}

			}

		}
		return -1;
	}

}
