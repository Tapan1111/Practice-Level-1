package Interfaces;

public class AnimalRunnner {
	public static void main(String[] args) {
		Animal[] animal = { new Dog(), new Cat() };
		for (Animal sound : animal) {
			sound.bark();

		}
	}

}
