package practice.BossCoder;

import java.util.Scanner;

public class ForLoops {

	// find average of the 10 inputs -------------/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a number : ");
			sum = sum + sc.nextInt();

		}
		System.out.println("avg is : " + sum / 10);
		sc.close();
	}

}
