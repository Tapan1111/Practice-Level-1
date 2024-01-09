package Interfaces;

public interface Operations {

	int perform(int x, int y); // abstract method

}

class Addition implements Operations {

	@Override
	public int perform(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}

}

class Substraction implements Operations {

	@Override
	public int perform(int x, int y) {
		int subs = 0;
		subs = x - y;
		return subs;
	}

}

class Divide implements Operations {

	@Override
	public int perform(int x, int y) {
		int div = 0;
		if (y == 0) {
			return -1;
		}

		div = x / y;
		return div;
	}

}
