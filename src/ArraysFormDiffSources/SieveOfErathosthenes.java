package ArraysFormDiffSources;

import java.util.Arrays;

public class SieveOfErathosthenes {
	public static void main(String[] args) {
		int n = 100;
		boolean[] table = new boolean[n + 1];
		Arrays.fill(table, true);
		System.out.println(Arrays.toString(table));
		int count = 0;
		for (int i = 2; i * i < n; i++) {
			if (table[i]) {
				for (int j = i * i; j < n; j = j + i) {
					table[j] = false;
				}

			}
		}
		for (int i = 2; i < n; i++) {
			if (table[i]) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(count);

	}

}
