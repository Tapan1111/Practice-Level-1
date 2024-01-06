package OOPs.Inheritance;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setEmail("tapanbehera5698@gmail.com");
//		student.setCollegeName("PMEC");
//		student.setName("Tapan Behera");
//		System.out.println(student);

		Employee employee = new Employee("Tapan Behera", "Programmer");
		employee.setEmail("tapanbehera5698@gmail.com");
		employee.setPhone(686868686);
		employee.setName("Tapan Behera");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer");

		System.out.println(employee);

	}

}
