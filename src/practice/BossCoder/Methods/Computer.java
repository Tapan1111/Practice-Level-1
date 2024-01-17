package practice.BossCoder.Methods;

public class Computer {

	public void playMusic() {
		System.out.println("Play some music.....");
	}

	public String getMeApen(int cost) {
		if (cost >= 10) {
			return "Pencil";
		}

		return "Nothing";

	}

}
