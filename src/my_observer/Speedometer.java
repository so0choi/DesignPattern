package my_observer;

import java.util.ArrayList;

public class Speedometer { // Observable
	private int currentSpeed;
	private ArrayList<SpeedMonitor> monitors;

	public Speedometer() {
		monitors = new ArrayList<SpeedMonitor>();
	}

	void addObserver(SpeedMonitor monitor) {
		monitors.add(monitor);
	}

	void deleteObserver(SpeedMonitor monitor) {
		int i = monitors.indexOf(monitor);
		if (i >= 0) {
			monitors.remove(i);
		}
	}

	void setChanged() {
		notifyObservers();
	}

	void notifyObservers() {
		for (SpeedMonitor monitor : monitors) {
			monitor.update(currentSpeed);
		}
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
		setChanged();
	}

}
