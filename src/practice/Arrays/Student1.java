package practice.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student1 {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student1(String name, int... marks) {
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}

	}


	@Override
	public String toString() {
		return "Student1 [name=" + name + ", marks=" + marks + "]";
	}



	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalNumberOfMark() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;

		}
		return sum;
	}

	public int getMaximumMarks() {

		return Collections.max(marks);
	}

	public int getminimumMark() {
		int minimum = Integer.MAX_VALUE;

		for (int min : marks) {
			if (min < minimum) {
				minimum = min;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMark() {
		int total = getNumberOfMarks();
		int sum = getTotalNumberOfMark();

		return new BigDecimal(sum).divide(new BigDecimal(total), 3, RoundingMode.UP);
	}



	public void removeMarksAtIndex(int index) {
		marks.remove(index);

	}



	public void addNewMarks(int mark) {
		marks.add(mark);

	}

}
