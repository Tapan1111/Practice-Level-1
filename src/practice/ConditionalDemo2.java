package practice;

public class ConditionalDemo2 {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		int result;
		boolean teCondition = true;
		result = teCondition ? value1 : value2;
		System.out.println(result);

		int cadence = 0;
		int[] anArray = new int[5];
		anArray[0] = 100;
		System.out.println("Element 1 at index 0 is " + anArray[0]);
	}

}
