package org.design.pattern.observer.weather.interf;

/**
 * 观察者对象接口
 */
public interface Observer {

	public void update(float temperature, float humidity, float pressure);
}
