package builtin_observer;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {
	public static final int SPEED_TO_ALERT = 70;
	private int speed;

	@Override
	public void update(Observable obs, Object obj) {
		// check speed
		if (obs instanceof Speedometer) {
			Speedometer speedo = (Speedometer) obs;
			speed = speedo.getCurrentSpeed();
			if (speed > SPEED_TO_ALERT) {
				System.out.println("**ALERT** Driving too fast!(" + speed + ")");
			} else {
				System.out.println("...nice and steady...(" + speed + ")");
			}
		}
	}
}
