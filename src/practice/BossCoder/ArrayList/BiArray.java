package practice.BossCoder.ArrayList;

public class BiArray {
	private int[] array1;

	private int[] array2;

	public BiArray(int[] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}

	public boolean areSumEqual() {
		int sum1 = calculateSum(array1);
		int sum2 = calculateSum(array2);

		// boolean areEqual = (sum1 == sum2);
		return sum1 == sum2;

	}

	private int calculateSum(int[] array) {
		int sum = 0;
		for (int value : array) {
			sum = sum + value;

		}
		return sum;
	}

}
