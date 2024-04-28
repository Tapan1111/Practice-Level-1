package PracticeAcc;

public class FindMetaNumber {
	public static void main(String[] args) {
		System.out.println(findMeta(20));

	}

	public static int findMeta(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 1 == 0 && i % 2 == 0 && i % 4 == 0 && i % 8 == 0 && i % 10 != 0) {
				count++;
			}
		}
		return count;
	}

}
