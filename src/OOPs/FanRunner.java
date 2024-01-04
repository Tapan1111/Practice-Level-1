package OOPs;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Usha", 0.25, "Maaroon");
		fan.switchOff();
		System.out.println(fan);
		fan.setSpeed(200);
		System.out.println(fan);
		fan.switchOn();
		System.out.println(fan);




	}

}
