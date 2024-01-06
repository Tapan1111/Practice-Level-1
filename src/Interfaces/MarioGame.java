package Interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump");

	}

	@Override
	public void down() {
		System.out.println("sit down");
	}

	@Override
	public void left() {
		System.out.println("fire");
	}

	@Override
	public void right() {
		System.out.println("roll");
	}

}
