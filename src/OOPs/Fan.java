package OOPs;

public class Fan {

	// state
	private String make;

	private double radius;

	private String color;

	private boolean isOn;

	private double speed;

	// creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed(2000);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed(0);
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Fan [make=" + make + ", radius=" + radius + ", color=" + color + ", isOn=" + isOn + ", speed=" + speed
				+ "]";
	}

}
