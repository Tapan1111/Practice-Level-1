package practice.BossCoder.forLoops;

public class LongestDivisionMethod {

	static final int INFINITY_ = 9999999;

	public static void main(String[] args) {
		LongestDivisionMethod ldm = new LongestDivisionMethod();
		System.out.println(ldm.perfectsquare(1225));

	}

	public static int perfectsquare(int n) {
		int i = 0, udigit, j; // Loop counters
		int cur_divisor = 0;
		int quotient_units_digit = 0;
		int cur_quotient = 0;
		int cur_dividend = 0;
		int cur_remainder = 0;
		int a[] = new int[10];

		while (n > 0) {
			a[i] = n % 100;
			n = n / 100;
			i++;
		}
		i--;
		for (j = i; j >= 0; j--) {

			// Initialising the remainder to the maximum value
			cur_remainder = INFINITY_;
			// Including the next segment in new dividend
			cur_dividend = cur_dividend * 100 + a[j];

			// Loop to check for the perfect square
			// closest to each segment
			for (udigit = 0; udigit <= 9; udigit++) {

				// This condition is to find the
				// divisor after adding a digit
				// in the range 0 to 9
				if (cur_remainder >= cur_dividend - ((cur_divisor * 10 + udigit) * udigit)
						&& cur_dividend - ((cur_divisor * 10 + udigit) * udigit) >= 0) {

					// Calculating the remainder
					cur_remainder = cur_dividend - ((cur_divisor * 10 + udigit) * udigit);

					// Updating the units digit of the quotient
					quotient_units_digit = udigit;
				}
			}
			cur_quotient = cur_quotient * 10 + quotient_units_digit;

			// New divisor is two times quotient
			cur_divisor = cur_quotient * 2;

			// Including the remainder in new dividend
			cur_dividend = cur_remainder;


		}
		return cur_quotient;
	}

}
