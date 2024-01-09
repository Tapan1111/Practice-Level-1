package Collections;

import java.util.Comparator;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student2, Student student1) {

		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class Student implements Comparable<Student> {

	private int id;

	private String name;

	private int age;

	private int rollNo;

	public Student(int id, String name, int age, int rollNo) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", rollNo=" + rollNo + "]";
	}


	@Override
	public int compareTo(Student that) {

		return Integer.compare(this.id, that.id);
	}

}
