package ArraysFormDiffSources;

import java.util.ArrayList;

public class TestAnswer {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();

		// Add the first row [1, 2, 3, 4]
		ArrayList<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		A.add(row1);

		// Add the second row [5, 6, 7, 8]
		ArrayList<Integer> row2 = new ArrayList<>();
		row2.add(5);
		row2.add(6);
		row2.add(7);
		row2.add(8);
		A.add(row2);

		// Add the third row [9, 10, 11, 12]
		ArrayList<Integer> row3 = new ArrayList<>();
		row3.add(9);
		row3.add(10);
		row3.add(11);
		row3.add(12);
		A.add(row3);

		ArrayList<ArrayList<Integer>> B = performOps(A);
		for (int i = 0; i < B.size(); i++) {
			for (int j = 0; j < B.get(i).size(); j++) {
				System.out.print(B.get(i).get(j) + " ");
			}
		}

		System.out.println(performOps(A));

	}

	public static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < A.size(); i++) {
			B.add(new ArrayList<Integer>());

			for (int j = 0; j < A.get(i).size(); j++) {
				B.get(i).add(0);
			}

			for (int j = 0; j < A.get(i).size(); j++) {
				B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
			}
		}
		return B;

	}

}
