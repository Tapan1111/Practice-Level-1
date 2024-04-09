package BinarySearch;

public class FindFirstOccurance {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 5, 5 };
		System.out.println(searchLast(arr, 5));

	}

	public static int searchFirst(int[] arr, int target) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == target) {
				ans = mid;
				e = mid - 1;
			} else if (arr[mid] > target) {
				e = mid - 1;

			} else {
				s = mid + 1;

			}
		}
		return ans;
	}

	public static int searchLast(int[] arr, int target) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == target) {
				ans = mid;
				s = mid + 1;
			} else if (arr[mid] > target) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

}
