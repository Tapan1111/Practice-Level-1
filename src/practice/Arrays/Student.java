package practice.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int... marks) { // variable Arguments
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
	
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		
		return sum;
	}

	public int getMaximumMarks() {
		// int maxNumber = 0;
		int maxNumber = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maxNumber) {
				maxNumber = mark;
			}

		}
		return maxNumber;
	}

	public int getMinimumMarks() {

		int minNumber = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minNumber) {
				minNumber = mark;
			}

		}
		return minNumber;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

}
