package OOPs;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address(3, "10-Downing street", "BBSR", 755027);

		Customer customer = new Customer("Tapan", homeAddress);

		Address officeAddress = new Address(1, "NewYork DownTown street", "NY", 765765);
		customer.setOfficeAddress(officeAddress);

		System.out.println(customer);

	}

}
