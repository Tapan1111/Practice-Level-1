package PepCoding;

public class NoFixedCols {

	public static void main(String[] args) {
		int[][] wrr = { { 1, 2, 3, 4 }, { 1, 2 }, { 6, 7, 8, 9 } };

		for (int row = 0; row < wrr.length; row++) {
			for (int col = 0; col < wrr[row].length; col++) {
				System.out.print(wrr[row][col]);
			}
			System.out.println();
		}


	}

}
