package practice.Arrays;

public class CalculateTotalWeight {

	private int weight;

	private int quantity;

	private int totalWeight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	public CalculateTotalWeight(int weight, int quantity) {
		this.weight = weight;
		this.quantity = quantity;

	}

	public int calculateTotalWeight() {
		int sum = 0;
		sum = weight * quantity;
		return sum;
	}

}
