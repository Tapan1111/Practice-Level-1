package PracticeAcc;

public class PrintDaysWeek {
	public static void main(String[] args) {
		pattern9(5);

//		for (int i = 1; i <= 4; i++) {
//			System.out.println("Week" + i);
//			for (int j = 1; j <= 7; j++) {
//				System.out.print("Days" + j + " ");
//			}
//			System.out.println();
//		}

	}

	public static void pattern2() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(i);
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {
		for (int i = n; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern8(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}

	public static void pattern9(int n) { 
		for(int i=0; i<n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

