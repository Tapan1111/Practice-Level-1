package practice.BossCoder.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {
	public static void main(String[] args) {

		NumberMagic magic = new NumberMagic();
		magic.determineAllFactors(99);
		System.out.println(magic.determineAllFactors(78));
		System.out.println(magic.determineMultiples(3, 30));
	}

	public List<Integer> determineAllFactors(int number) {

		List<Integer> factor = new ArrayList<Integer>();

		if (number <= 0) {
			return factor;
		}
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				factor.add(i);
			}

		}
		return factor;
	}

	public List<Integer> determineMultiples(int number, int limit) {
		List<Integer> multiples = new ArrayList<Integer>();

		if (number <= 0 || limit <= 0) {
			return multiples;
		}
//		for (int i = 1; number * i < limit; i++) {
//			multiples.add(number * i);
//		}
		int i = 1;
		while (number * i < limit) {
			multiples.add(number * i);
			i++;
		}
		return multiples;
	}

}
