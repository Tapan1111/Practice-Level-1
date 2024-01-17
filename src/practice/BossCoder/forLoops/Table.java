package practice.BossCoder.forLoops;

import java.util.Arrays;

public class Table {
	public static void main(String[] args) {
		Table table = new Table();
		table.solve(5);
		System.out.println(Arrays.toString(table.solve(5)));

	}

	public static int[] solve(int n) {
		int[] tab = new int[10];
		for (int i = 1; i <= 10; i++) {
			tab[i - 1] = i * n;

		}
//		System.out.println(Arrays.toString(tab));
		return tab;
	}

}
