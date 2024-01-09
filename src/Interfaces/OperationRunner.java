package Interfaces;

public class OperationRunner {

	public static void main(String[] args) {

		Operations[] operation = { new Addition(), new Substraction(), new Divide() };
		for (Operations operate : operation) {
			System.out.println(operate.perform(10, 9));
		}

	}

}
