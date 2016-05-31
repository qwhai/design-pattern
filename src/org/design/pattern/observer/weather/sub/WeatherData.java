package org.design.pattern.observer.weather.sub;

import java.util.ArrayList;

import org.design.pattern.observer.weather.interf.Observer;
import org.design.pattern.observer.weather.interf.Subject;

/**
 * 被观察者对象(或称为主题)
 */
@SuppressWarnings("rawtypes")
public class WeatherData implements Subject {

    private ArrayList observers = null; // 观察者列表
	
	private float temperature; // 温度
	private float humidity; // 湿度
	private float pressure; // 气压
	
    public WeatherData() {
		observers = new ArrayList();
	}
	
	@SuppressWarnings("unchecked")
    @Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	/**
	 * 更新通知所有的观察者
	 */
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
