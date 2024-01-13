package practice.BossCoder.ArrayList;

import java.util.Scanner;

public class Arr2d1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfStudents = 5;
		int noOfSubject = 4;
		String[] names = new String[noOfStudents];
		int[][] marks = new int[noOfStudents][noOfSubject];
		int[] totalMarks = new int[noOfStudents];

		System.out.println("Enter rthe names of the students :: ");

		String str = sc.nextLine();
		names = str.split(" ");
		for (String i : names) {
			System.out.println(i);
			
		}
		sc.close();
		

		String[] list = new String[noOfSubject];

		for (int i = 0; i < noOfStudents; i++) {
			int[] arr = new int[noOfSubject];
			str = sc.nextLine();
			list = str.split(" ");
			for (int j = 0; j < noOfSubject; j++) {
				arr[j] = Integer.parseInt(list[j]);
			}
			marks[i] = arr;
		}
		int total;
		int highestMarks = Integer.MIN_VALUE;
		int highestMarksIdx = 0;
		int lowestMark = Integer.MAX_VALUE;
		int lowestMarkIdx = 0;
		for(int i=0; i< noOfStudents; i++) {
			total = 0;
			for(int j=0; j<noOfSubject; j++) {
				total = total + marks[i][j];
			}
			totalMarks[i] = total;
			if (total > highestMarks) {
				highestMarks = total;
				highestMarksIdx = i;
			}
			if (total < lowestMark) {
				lowestMark = total;
				lowestMarkIdx = i;
			}
		}
		int globalTotal = 0;
		for (int i = 0; i < noOfStudents; i++) {
			System.out.println(names[i] + " total+marks : " + totalMarks[i]);
			globalTotal = globalTotal + totalMarks[i];
		}
		System.out.println("Highest marks obtained : " + names[highestMarksIdx]);
		System.out.println("Lowest marks obtained : " + names[lowestMarkIdx]);
		System.out.println("average marks  : " + globalTotal / noOfStudents);

	}

}
