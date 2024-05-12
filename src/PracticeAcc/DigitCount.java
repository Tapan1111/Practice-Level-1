package PracticeAcc;

public class DigitCount {
	public static void main(String[] args) {
		int digit = 5647;
		int count = 0;
		while (digit > 0) {
			count++;
			digit = digit / 10;
		}
		System.out.println(count);
	}
}
