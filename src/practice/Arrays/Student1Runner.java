package practice.Arrays;

import java.math.BigDecimal;

public class Student1Runner {

	public static void main(String[] args) {
		Student1 student1 = new Student1("Tapan Behera", 98, 87, 76, 65, 76, 99);

		int number = student1.getNumberOfMarks();
		System.out.println("noofmarks: " + number);

		int sum = student1.getTotalNumberOfMark();
		System.out.println("Total Mark : " + sum);

		int maximumNumber = student1.getMaximumMarks();
		System.out.println("maximum marks : " + maximumNumber);

		int minimumMarks = student1.getminimumMark();
		System.out.println("minimum marks : " + minimumMarks);

		BigDecimal average = student1.getAverageMark();
		System.out.println("average Marks : " + average);

		System.out.println(student1);
		student1.addNewMarks(35);
		System.out.println(student1);

		student1.removeMarksAtIndex(5);
		System.out.println(student1);

	}

}
