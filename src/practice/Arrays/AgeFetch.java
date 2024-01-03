package practice.Arrays;

import java.time.LocalDate;
import java.time.Period;

public class AgeFetch {

	private int age;

	private LocalDate date;

	private String DoB;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDoB() {
		return DoB;
	}

	public void setDoB(String doB) {
		DoB = doB;
	}

	public AgeFetch(String DoB) {
		this.date = LocalDate.parse(DoB);
		calculateAge();
	}

	public AgeFetch(int i) {
		// TODO Auto-generated constructor stub
	}

	private void calculateAge() {
		LocalDate currentDate = LocalDate.now();
		Period period = Period.between(date, currentDate);
		this.age = period.getYears();

	}

	public int age() {
		return age;
	}


	public static void main(String[] args) {
		
		AgeFetch age = new AgeFetch(2000 - 05 - 06);
		System.out.println("Age: " + age.getAge());
//		age.calculateAge();
//		System.out.println(age);

	}


}
