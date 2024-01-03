package practice.BossCoder.ArrayList;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int rows = 2;
		int cols = 3;
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
