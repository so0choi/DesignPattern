package observerpattern;

public class Test {
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay currentCondition = new CurrentConditionsDisplay(wd);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(wd);
		ForecastDisplay forecast = new ForecastDisplay(wd);
		HeatIndexDisplay heatindex = new HeatIndexDisplay(wd);

		wd.setMeasurements(80, 65, 30.4f);
		wd.setMeasurements(82, 70, 29.2f);
		wd.setMeasurements(78, 90, 29.2f);

	}

}
