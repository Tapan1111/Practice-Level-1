package practice.BossCoder.forLoops;

public class LoopFor {
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
//			System.out.println("Study Hard or Die");
		}

//		int n = 100;
		int i = 1;
		while (i < 10) {
			// System.out.println("You Have to break the cycle...");
			i++;
		}

		int j = 1;
		do {

			// System.out.println("Your Father is working Hard What is Stoping you do the
			// same...");
			j++;
		} while (j < 10);

		int k = 1;
		do {
			if (k % 2 == 0) {
				System.out.println(k);
			}
			k++;
		} while (k <= 20);

	}

}
