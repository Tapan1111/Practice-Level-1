package practice.BossCoder;

import java.util.Scanner;

public class GreatestAmong4 {
	Scanner sc = new Scanner(System.in);
	int input1 = sc.nextInt();
	int input2 = sc.nextInt();
	int input3 = sc.nextInt();
	int input4 = sc.nextInt();

	public static void main(String[] args) {
		
		
		System.out.println(maximus(11, 2, 3, 99));
		
	}

	public static int maximus(int input1, int input2, int input3, int input4) {
		int max = input1;
		if (input2 > max) {
			return max;
		} else if (input3 > max) {
			return max;
		} else if (input4 > max) {
			return max;
		}

		return max;
		
	}

}
