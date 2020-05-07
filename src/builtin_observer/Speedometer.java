package builtin_observer;

import java.util.Observable;

public class Speedometer extends Observable {
//simulate of a speedometer
	private int currentSpeed;

	public void speedChanged() {
		setChanged();
		notifyObservers();
	}

	public void setCurrentSpeed(int speed) {
		currentSpeed = speed;
		speedChanged();
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}
}
