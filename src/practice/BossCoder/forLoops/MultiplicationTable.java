package practice.BossCoder.forLoops;

public class MultiplicationTable {
	public static void main(String[] args) {
		table(24);
		System.out.println();
		table(50);
		System.out.println();
		table(29);

	}

	public static void table(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);

		}
	}

}
