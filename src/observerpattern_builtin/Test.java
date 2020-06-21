package observerpattern_builtin;

import observerpattern.CurrentConditionsDisplay;
import observerpattern.WeatherData;

public class Test {
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay currentCondition = new CurrentConditionsDisplay(wd);

		wd.setMeasurements(80, 65, 30.4f);
		wd.setMeasurements(82, 70, 29.2f);
		wd.setMeasurements(78, 90, 29.2f);

	}

}
