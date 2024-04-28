package PracticeAcc;

public class CardsRequiredToBuildTriangle {
	public static void main(String[] args) {
		int level = 3;
		System.out.println(calculate(level));
	}

	public static int calculate(int n) {
		int ans = 0;
		int level = 1;
		while (level <= n) {
			ans = ans + (level * 3);
			level++;
		}
		return ans - n;
	}
}
