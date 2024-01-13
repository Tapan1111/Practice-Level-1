package practice;

import java.util.Scanner;

public class GreatestOf4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  4 numbers :: ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int input4 = sc.nextInt();

		if (input1 > input2 && input1 > input3 && input1 > input4) {
			System.out.println("greater no is " + input1);
		} else if (input2 > input3 && input2 > input4) {
			System.out.println("greater no is " + input2);
		} else if (input3 > input4) {
			System.out.println("greater no is " + input3);
		} else {
			System.out.println("greater no is " + input4);
		}

		sc.close();

	}

}
