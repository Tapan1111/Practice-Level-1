package practice.BossCoder.forLoops;

import java.util.Scanner;

public class InputFromHer {
	public static void main(String[] args) {

		inpfromher();
	}

	public static void inpfromher() {
		String choice = "";
		int sum = 0;
		int product = 1;
		int count = 0;
		Scanner input = new Scanner(System.in);

		while (!choice.equals("q")) {
			System.out.println("Enter a number or q to exit : ");
			choice = input.next();

			if (!choice.equals("q")) {
				int number = Integer.parseInt(choice);
				sum = sum + number;
				product = product * number;
				count++;
			}
		}
		System.out.println("Your product of all the number is : " + product);
		System.out.println("Your sum of all the numbner is : " + sum);
	}

}
