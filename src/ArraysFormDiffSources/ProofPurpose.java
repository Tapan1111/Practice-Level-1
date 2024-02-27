package ArraysFormDiffSources;

import java.util.Arrays;

public class ProofPurpose {
	public static void main(String[] args) {
		String str = "sdfvsdf68fsdfsf8999fsdf09";
		String numberOnly = str.replaceAll("[^0-9]", "");
		int[] arr = new int[numberOnly.length()];
		System.out.println(numberOnly);
		for (int i = 0; i < arr.length; i++) {
			// arr[i] = Integer.parseInt(numberOnly.charAt(i));
		}
		Arrays.sort(arr);


	}

}
