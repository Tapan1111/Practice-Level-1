package ArraysFormDiffSources;

public class TargetSum {
	public static void main(String[] args) {
		TargetSum sum = new TargetSum();
		// int[] arr = { 4, 6, 3, 5, 8, 2 };
		// int[] arr = { 1, 4, 5, 6, 3 };
		int[] arr = { 1, 4, 5, 6, 3, 1, 4, 6, 3 };
		int target = 12;
		System.out.println(sum.findUnique(arr));
	}

	public int solution(int[] arr, int target) {
		int n = arr.length;
		int count = 0 ;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]+arr[j] == target) {
					count++;
				}
			}
		}
		return count;
	}

	public int tripletSum(int[] arr, int target) {
		int n = arr.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						ans++;
					}
				}
			}
		}
		return ans;
	}

	public int findUnique(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int ans = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				ans = arr[i];
			}
		}
		return ans;
	}

	public int findUnique2(int[] arr) {
		int n = arr.length;
		int unique = 0;
		for (int i = 0; i < n; i++) {
			unique = unique ^ arr[i];
		}
		return unique;
	}
}
