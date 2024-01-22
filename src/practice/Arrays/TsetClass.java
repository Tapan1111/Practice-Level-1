package practice.Arrays;

public class TsetClass {
	public static void main(String[] args) {
		TsetClass tst = new TsetClass();
		int[] nums = { 1, 3, 5, 6 };
		System.out.println(tst.searchIndex(nums, 2));

//		System.out.println(Arrays.toString(nums));
//		System.out.println(nums.length);
	}

	public int searchIndex(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else if (nums[mid] > target) {
				end = mid - 1;
			}
		}

		return start;
	}

}
