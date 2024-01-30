package practice.Arrays;

public class UniqueElement {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 5, 2, 2, 3, 3 };

		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		System.out.println(xor);

		// brute-approach
//		Set<Integer> s = new HashSet<Integer>();
//		for (Integer integer : arr) {
//			s.add(integer);
//		}
//		System.out.println(s);

//		int i = 0;
//		for (int j = 1; j < arr.length; j++) {
//			if (arr[j] != arr[i]) {
//				arr[i + 1] = arr[j];
//				i++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(i + 1);

	}

}
