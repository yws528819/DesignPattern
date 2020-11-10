package com.yws.observer;

public class BaiduSite implements Observer{

	@Override
	public void update(float temperature, float pressure, float humidity) {
		System.out.println("===百度网站====");
		System.out.println("***百度网站  温度: " + temperature + "***");
		System.out.println("***百度网站  气压: " + pressure + "***");
		System.out.println("***百度网站  湿度: " + humidity + "***");
	}

}
