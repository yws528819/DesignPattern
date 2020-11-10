package com.yws.observer;

public class Client {
	public static void main(String[] args) {
		//创建一个weatherData
		WeatherData weatherData = new WeatherData();
		
		//创建观察者注册到weatherData
		weatherData.registerObserver(new CurrentConditions());
		Observer baiduSite = new BaiduSite();
		weatherData.registerObserver(baiduSite);
		
		System.out.println("通知各个注册的观察者, 看看信息");
		weatherData.setData(29f, 100f, 30.3f);
		
		
		//移除百度
		weatherData.removeObserver(baiduSite);
		System.out.println();
		System.out.println("****移除百度****");
		System.out.println("通知各个注册的观察者, 看看信息");
		weatherData.setData(29f, 100f, 3f);
	}
}
