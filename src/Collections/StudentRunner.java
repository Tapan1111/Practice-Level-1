package Collections;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {

		List<Student> students = List.of(new Student(1, "Tapan", 23, 14), new Student(3, "Satrujit", 24, 18),
				new Student(2, "Jeetu", 23, 16));

		List<Student> studentAl = new ArrayList<Student>(students);
		System.out.println(studentAl);

		studentAl.sort(new AscendingStudentComparator());
		System.out.println(studentAl);



	}

}
