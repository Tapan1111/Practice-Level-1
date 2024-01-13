package practice.BossCoder.forLoops;

public class StarPattern2 {
	public static void main(String[] args) {
		pattern(5);

	}

	public static void pattern(int n) {
		int space = n / 2;
		int star = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if (i <= n / 2) {
				space--;
				star = star + 2;
			} else {
				space++;
				star = star - 2;
			}
			System.out.println();
		}

	}
}
