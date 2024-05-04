package practice.Arrays;

import java.util.Arrays;

public class HoursCount {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 58, 60, 60 };
		System.out.println(countFullHourPairs(arr));

	}

	public static int countFullHourPairs(int[] A) {
        Arrays.sort(A);
        int count = 0;
        int mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int sum = A[i] + A[j];
                if (sum % 60 == 0) {
                    count++;
                    count %= mod;
                }
            }
        }
        if (count == 0) {
			return -1;
        } else {
            return count;
        }
    }
}
