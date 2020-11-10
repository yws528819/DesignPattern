package com.yws.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	private float temperature;
	private float pressure;
	private float humidity;
	
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	
	private List<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	//有数据更新时，就调用setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//将最新的消息，推送给观察者
		notifyObservers();
	}
	
	
	
	//注册一个观察者
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	//移除一个观察者
	@Override
	public void removeObserver(Observer o) {
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}
	//遍历所有的观察者，并通知
	@Override
	public void notifyObservers() {
		observers.stream().forEach(o->o.update(temperature, pressure, humidity));
	}

}
