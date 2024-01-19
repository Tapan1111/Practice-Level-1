package practice.BossCoder.forLoops;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int input = sc.nextInt();
		int temp;
		int rem;
		int sum = 0;
		temp = input;
		while (input != 0) {
			rem = input % 10;
			sum = sum + (rem * rem * rem);
			input = input / 10;
		}
		if (temp == sum) {
			System.out.println("This is an armstrong number: " + sum);
		} else {
			System.out.println("not an armstrong number");
		}

	}

}
