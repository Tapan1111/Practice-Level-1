package practice.BossCoder;

public class BcPatternProblems {

	public static void main(String[] args) {
		int n;

//		printPattern1(5);
//		printPattern2(9); 
//		printPattern3(5);
//		printpattern4(5);
		printPatten09(5);

	}

	public static void printPattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printPattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void printPattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void printpattern4(int n) {
		for (int i = n; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void patternPrint(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printPatterns(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

//		for (int i = 0; i <= n; i++) {
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
	}

	public static void printPatterntriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i) + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void printPatten09(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * n - ((2 * i) + 1); j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
