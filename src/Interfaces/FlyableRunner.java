package Interfaces;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Fly by wings");
	}
}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("Fly by fuel");

	}

}

public class FlyableRunner {
	public static void main(String[] args) {
		
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable obj : flyingObjects) {
			obj.fly();
		}

	}

}
