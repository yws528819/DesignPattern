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
	
	//�����ݸ���ʱ���͵���setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//�����µ���Ϣ�����͸��۲���
		notifyObservers();
	}
	
	
	
	//ע��һ���۲���
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	//�Ƴ�һ���۲���
	@Override
	public void removeObserver(Observer o) {
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}
	//�������еĹ۲��ߣ���֪ͨ
	@Override
	public void notifyObservers() {
		observers.stream().forEach(o->o.update(temperature, pressure, humidity));
	}

}
