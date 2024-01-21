package practice;

public class ArithmeticDemo {
	public static void main(String[] args) {
		int result = 1 + 2;
		System.out.println(result);

        System.out.println("1 + 2 = " + result);
		int original_result = result;
		System.out.println(original_result);

		result = result - 1;
		System.out.println(result);
		System.out.println(original_result + " - 1 = " + result);
		original_result = result;
		System.out.println(original_result);

		result = result * 2;
		System.out.println(result);
		System.out.println(original_result + " *2= " + result);
		original_result = result;

	}

}
