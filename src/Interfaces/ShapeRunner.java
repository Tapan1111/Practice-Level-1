package Interfaces;

public class ShapeRunner {

	public static void main(String[] args) {
		
		Shape[] shape = { new Circle("Circle", 4.5), new Rectangle("Rectangle", 4.5, 5.2) };
		for (Shape shapes : shape) {
			shapes.calculateArea();
			shapes.displayInfo();
		}

	}

}
