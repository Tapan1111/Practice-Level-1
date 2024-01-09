package Interfaces;

public abstract class Shape {

	protected String name;

	public Shape(String name) {
		this.name = name;
	}

	public abstract double calculateArea();

	public void displayInfo() {
		System.out.println("shape is : " + name);
		System.out.println("area is : " + calculateArea());
	}

}
