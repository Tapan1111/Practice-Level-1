package practice.BossCoder.Methods;

public class SwitchCase {
	public static void main(String[] args) {

		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("You got 80 percent ");
			break;
		case 'B':
			System.out.println("You got 70 percent ");
			break;
		case 'C':
			System.out.println("You got 60 percent ");
			break;
		case 'D':
			System.out.println("You got 50 percent ");
			break;
		case 'E':
			System.out.println("You got 40 percent ");
			break;

		default:
			System.out.println("FAIL");

		}
	}

}
