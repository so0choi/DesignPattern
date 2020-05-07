package my_observer;

public class SpeedMonitor { // Observer
	public static final int SPEED_TO_ALERT = 70;
	private int speed;

	public void update(int speed) {
		this.speed = speed;
		if (speed > SPEED_TO_ALERT) {
			System.out.println("**ALERT** Driving too fast!(" + speed + ")");
		} else {
			System.out.println("...nice and steady...(" + speed + ")");
		}
	}
}
