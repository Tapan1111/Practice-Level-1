package practice.Arrays;

public class CalculateTotalWeightRunner {

	public static void main(String[] args) {
		CalculateTotalWeight weight = new CalculateTotalWeight(200, 5);
		int sum = weight.calculateTotalWeight();
		System.out.println(sum);

	}

}
