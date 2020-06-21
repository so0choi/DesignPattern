package observerpattern;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float sumTemperature;
	private float avgTemperature;
	private float maxTemperature;
	private float minTemperature;
	private int countTemperature;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		sumTemperature = 0;
		avgTemperature = 0;
		maxTemperature = -1;
		minTemperature = 1000000;
		countTemperature = 0;
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		sumTemperature += temperature;
		countTemperature++;
		if (maxTemperature < temperature)
			maxTemperature = temperature;
		if (minTemperature > temperature)
			minTemperature = temperature;
		avgTemperature = sumTemperature / countTemperature;
		display();
	}

}
