package PracticeAcc;

import java.util.Arrays;

public class OperationBinaryString {
	public static void main(String[] args) {
		String str = "0C1A1B1C1C1B0A0";
		System.out.println(operationBinaryStr(str));

	}

	public static int operationBinaryStr(String str) {
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		int result = arr[0] - '0';
		for (int i = 1; i < arr.length - 1; i++) {
			char operator = arr[i];
			int operand = arr[i + 1] - '0';
			if (operator == 'A') {
				result = result & operand;
			} else if (operator == 'B') {
				result = result | operand;
			} else if (operator == 'C') {
				result = result ^ operand;
			}
		}
		return result;
	}
}
