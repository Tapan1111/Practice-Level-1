package ArraysFormDiffSources;

public class FindingIndexOfArrays {
	public static void main(String[] args) {
		FindingIndexOfArrays element = new FindingIndexOfArrays();
		int[] arr = { 4, 55, 6, 7, 98, 23, 8 };
		int t = 55;
		System.out.println(element.findelement(arr, t));
	}

	public int findIndex(int[] arr, int t) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == t) {
				return i;

			}
		}
		return -1;
	}

	public int findelement(int[] arr, int t) {
		int ans = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == t) {
				ans = i;
				break;

			}
		}
		return ans;
	}

}
