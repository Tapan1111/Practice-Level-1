package PepCoding;

import java.util.Scanner;

public class NXNMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NXNMatrix mat = new NXNMatrix();
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

		mat.transpose(matrix);
		System.out.println();

	}

	public void transpose(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[j][i]);
			}
			System.out.println();
		}
	}

}
