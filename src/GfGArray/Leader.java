package GfGArray;

import java.util.ArrayList;

public class Leader {
	public static ArrayList<Integer> ldr(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = arr.length;
		int currLdr = arr[n - 1];
		ans.add(currLdr);
		for (int i = n - 2; i >= 0; i--) {
			if (currLdr < arr[i]) {
				currLdr = arr[i];
				ans.add(currLdr);

			}
		}
		return ans;
	}

	public static ArrayList<Integer> leader(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = arr.length;
		for(int i=0; i<n; i++) {
			boolean flag = false;
			for(int j =i+1; j<n; j++) {
				if(arr[i] <= arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				ans.add(arr[i]);
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 10, 6, 5, 2 };
//		System.out.println(ldr(arr));
		System.out.println(leader(arr));

	}
}
