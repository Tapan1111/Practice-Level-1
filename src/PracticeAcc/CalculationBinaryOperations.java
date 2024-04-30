package PracticeAcc;

public class CalculationBinaryOperations {
	public static void main(String[] args) {
		String str = "1C0C1C1A0B1";
		System.out.println(calculateBinaryOperastiopn(str));

	}

	public static int calculateBinaryOperastiopn(String str) {
//		if (str.length() == 0) {
//			return -1;
//		}
		char[] arr = str.toCharArray();
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
