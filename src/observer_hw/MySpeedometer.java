package observer_hw;

import java.util.ArrayList;

public class MySpeedometer implements Subject {
	ArrayList observers;
	int speed;

	public MySpeedometer() {
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Object object : observers) {
			Observer o = (Observer) object;
			o.update(speed);
		}

	}

	public void speedChanged() {
		notifyObserver();
	}

	public void setCurrentSpeed(int speed) {
		this.speed = speed;
		speedChanged();
	}

}
