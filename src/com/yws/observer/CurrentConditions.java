package com.yws.observer;

public class CurrentConditions implements Observer{

	@Override
	public void update(float temperature, float pressure, float humidity) {
		System.out.println("===CurrentCondition====");
		System.out.println("***Today mTemperature: " + temperature + "***");
		System.out.println("***Today mPressure: " + pressure + "***");
		System.out.println("***Today mHumidity: " + humidity + "***");
	}

}
