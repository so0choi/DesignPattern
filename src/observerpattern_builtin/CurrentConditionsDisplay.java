package observerpattern_builtin;

import java.util.Observable;
import java.util.Observer;

import observerpattern.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;

	Observable observable;

	public CurrentConditionsDisplay(Observable o) {
		observable = o;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + " degrees and " + humidity + " %humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
