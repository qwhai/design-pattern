package org.design.pattern.observer.weather.test;

import org.design.pattern.observer.weather.obj.CurrentConditionsDisplay;
import org.design.pattern.observer.weather.obj.ForecastDisplay;
import org.design.pattern.observer.weather.obj.StatisticsDisplay;
import org.design.pattern.observer.weather.sub.WeatherData;

public class WeatherStation {

	@SuppressWarnings("unused")
    public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
		weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println();
	}

}
