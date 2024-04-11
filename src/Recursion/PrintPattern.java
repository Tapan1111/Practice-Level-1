package Recursion;

public class PrintPattern {
	public static void main(String[] args) {
		triangle(4, 0);

	}

	private static void starWar(int r, int c) {
		if (r == 0) {
			return;
		}
		if (r > c) {
			System.out.print("*");
			starWar(r, c + 1);
		} else {
			System.out.println();
			starWar(r - 1, 0);
		}

	}

	private static void triangle(int r, int c) {
		if (r == 0) {
			return;
		}
		if (r > c) {
			
			triangle(r, c + 1);
			System.out.print("*");
		} else {

			triangle(r - 1, 0);
			System.out.println();
		}

	}
}
