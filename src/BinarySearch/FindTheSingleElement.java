package BinarySearch;

public class FindTheSingleElement {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 4, 5, 6, 6, 7, 7, 8, 8 };
		System.out.println(fingSingle(arr));

	}

	public static int fingSingle(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] != arr[mid + 1] && arr[mid - 1] != arr[mid]) {
				return arr[mid];
			}else {
				s = mid+1;
			}
		}
		return arr[s];
	}
}
