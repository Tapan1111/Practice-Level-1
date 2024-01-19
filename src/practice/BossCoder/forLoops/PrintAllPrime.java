package practice.BossCoder.forLoops;

public class PrintAllPrime {
	public static void main(String[] args) {
		int count = 0;
		int n = 0;
		int i = 1;
		int j = 1;

		while (n <= 100) {
			j = 1;
			count = 0;
		}
		while (j <= i) {
			if (1 % j == 0)
				;
			count++;
			j++;
		}
		if (count == 2) {
			System.out.println(i);
			n++;
		}
		i++;

	}

}
