package PracticeAcc;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		int[] arr = { 100, 4, 200, 1, 3, 2 };
		System.out.println(longestConsecutive(arr));
	}

	public static int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : nums) {
			set.add(i);
		}
		int ans = 0;
		for (int i : nums) {
			if (!set.contains(i - 1)) {
				int current = i + 1;
				while (set.contains(current)) {
					current = current + 1;
				}
				int lastEle = current - 1;
				ans = Math.max(ans, lastEle - i + 1);
			}
		}
		return ans;
	}

}
