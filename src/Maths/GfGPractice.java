package Maths;

public class GfGPractice {
	public static int countNums(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;

	}

	public static int digitsInFactorial(int n) {
		int ans = 1;
		int count = 0;
		for (int i = n; i > 0; i--) {
			ans = ans * i;
		}
		while (ans > 0) {
			ans = ans / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
//		System.out.println(countNums(12345));
		System.out.println(digitsInFactorial(5));

	}

}
