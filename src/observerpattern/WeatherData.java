package observerpattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int observerIndex = observers.indexOf(o);
		if (observerIndex >= 0)
			observers.remove(observerIndex);
		else
			System.out.println("등록된 subscriber가 아닙니다");
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}

	public void measurementChanged() {
		notifyObservers();
	}

	public void setMeasurements(float t, float h, float p) {
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		measurementChanged();
	}

}
