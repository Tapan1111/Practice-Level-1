package practice;

public class Student
{
	
	int studentId = 11;
	String studentName = "Tapan";
	String studentCity = "Bhubaneshwar";
	
	public void Study() {
		System.out.println(studentName + " is studying");
	}
	
	
	public void  ShowDetails() {
		System.out.println(studentId + " is studying");
		
		System.out.println(studentName + " is his name");
		System.out.println(studentCity + " is his city");
	}

}
