package practice.Arrays;

public class StoreWater {
	public static void main(String[] args) {
		int radius = 5;
		int height = 10;
		int waterStored = calculateWater(radius, height);
		System.out.println(waterStored);

	}

	public static int calculateWater(int radius, int height) {
		// Given constant value for pi
		double pi = 3.14;

		// Volume of water = pi * radius^2 * height
		double volume = pi * radius * radius * height;

		// Convert volume to litres (1 litre = 1000 cubic centimeters)
		int litres = (int) Math.round(volume);

		return litres;
	}

}
