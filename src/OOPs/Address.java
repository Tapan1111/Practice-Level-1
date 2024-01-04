package OOPs;

public class Address {

	private int line1;

	private String street;

	private String city;

	private int zipCode;

	public Address(int line1, String street, String city, int zipCode) {
		super();
		this.line1 = line1;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
	}

}
