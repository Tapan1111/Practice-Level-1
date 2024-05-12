package PracticeAcc;

public class BeautifulDaysAtMovies {
	public static void main(String[] args) {
		System.out.println(beautifulDays(20, 23, 6));

	}

	public static int beautifulDays(int a, int b, int k) {
		int count = 0;
		for (int i = a; i <= b; i++) {
			int num = i;
			int rev = 0;
			while (num != 0) {
				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			int diff = Math.abs(a - rev);
			if (diff % k == 0) {
				count++;
			}
		}
		return count;
	}
}
