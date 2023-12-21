package practice.Arrays;

import java.math.BigDecimal;

public class StudentRunner {
	public static void main(String[] args) {



		Student std = new Student("Tapan", 87, 78, 90, 99);

		Student std1 = new Student("Tapan", 87, 78);

		Student std2 = new Student("Tapan", 87, 78, 90, 99, 34, 45, 56);

		int number = std.getNumberOfMarks();
		System.out.println("number :" + number);

		int sum = std.getTotalSumOfMarks();
		System.out.println("sum of marks :" + sum);

		int maximumMarks = std.getMaximumMarks();
		System.out.println("maxnumber :" + maximumMarks);
		int minimumMarks = std.getMinimumMarks();
		System.out.println("Minimum Mark :" + minimumMarks);

		BigDecimal average = std2.getAverageMarks();
		System.out.println("Average Mark :" + average);


	}

}
