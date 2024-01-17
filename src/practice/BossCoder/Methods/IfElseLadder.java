package practice.BossCoder.Methods;

public class IfElseLadder {
	public static void main(String[] args) {

		int marks = 50;

		int a = 5;
		int b = 3;
		int min;
		min = (a < b) ? a : b;
		System.out.println(min);

		if (marks < 30) {
			System.out.println("Fail");
		} else if (marks > 60) {
			System.out.println("A");
		} else if (marks >= 50) {
			System.out.println("B");
		} else if (marks > 40) {
			System.out.println("c");
		} else if (marks > 30) {
			System.out.println("D");

		} else {
			System.out.println("Pass");
		}

	}

}
