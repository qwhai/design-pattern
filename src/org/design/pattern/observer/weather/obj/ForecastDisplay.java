package org.design.pattern.observer.weather.obj;

import org.design.pattern.observer.weather.interf.DisplayElement;
import org.design.pattern.observer.weather.interf.Observer;
import org.design.pattern.observer.weather.interf.Subject;

/**
 * 观察者：森林环境
 *
 * Blog : http://blog.csdn.net/lemon_tree12138
 * GitHub : https://github.com/William-Hai
 */
public class ForecastDisplay implements Observer, DisplayElement {

	private float temperature; // 温度
	private float humidity; // 湿度
	@SuppressWarnings("unused")
    private Subject weatherData = null;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Forecast: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
