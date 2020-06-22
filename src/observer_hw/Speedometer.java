package observer_hw;

import java.util.Observable;

public class Speedometer extends Observable {
	int currentSpeed = 0;

	public void setCurrentSpeed(int speed) {
		this.currentSpeed = speed;
		setChanged();
		notifyObservers();
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

}
