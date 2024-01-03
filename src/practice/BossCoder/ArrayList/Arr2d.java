package practice.BossCoder.ArrayList;

import java.util.Scanner;

public class Arr2d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfStudents = 4;
		int subject = 3;
		String[] names = new String[noOfStudents];
		int[][] marks = new int[noOfStudents][subject];
		int[] totalMarks = new int[noOfStudents];

		System.out.println("Enter the names of the students : ");

		String str = sc.nextLine();
		names = str.split(" ");
		for (String i : names) {
			System.out.println(i);
		}


		String[] list = new String[subject];


		for (int i = 0; i < noOfStudents; i++) {
			int[] arr = new int[subject];
			str = sc.nextLine();
			list = str.split(" ");
			for (int j = 0; j < subject; j++) {
				arr[j] = Integer.parseInt(list[j]);
			}
			marks[i] = arr;
		}

		int total;
		int highestMarks = Integer.MIN_VALUE;
		int highestMarkIdx = 0;
		int lowestMarks = Integer.MAX_VALUE;
		int lowestMarkIndex = 0;
		for (int i = 0; i < noOfStudents; i++) {
			total = 0;
			for (int j = 0; j < subject; j++) {
				total += marks[i][j];
			}
			totalMarks[i] = total;
			if (total > highestMarks) {
				highestMarks = total;
				highestMarkIdx = i;
			}
			if (total < lowestMarks) {
				lowestMarks = total;
				lowestMarkIndex = i;
			}
		}
		int globalTotal = 0;
		for (int i = 0; i < noOfStudents; i++) {
			System.out.println(names[i] + " : " + totalMarks[i]);
			globalTotal = globalTotal + totalMarks[i];
		}
		System.out.println(" highest - " + names[highestMarkIdx]);

		System.out.println(" lowest - " + names[lowestMarkIndex]);

		System.out.println(" Average - " + globalTotal / noOfStudents);

	}

}
