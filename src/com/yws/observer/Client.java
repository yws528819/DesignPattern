package com.yws.observer;

public class Client {
	public static void main(String[] args) {
		//����һ��weatherData
		WeatherData weatherData = new WeatherData();
		
		//�����۲���ע�ᵽweatherData
		weatherData.registerObserver(new CurrentConditions());
		Observer baiduSite = new BaiduSite();
		weatherData.registerObserver(baiduSite);
		
		System.out.println("֪ͨ����ע��Ĺ۲���, ������Ϣ");
		weatherData.setData(29f, 100f, 30.3f);
		
		
		//�Ƴ��ٶ�
		weatherData.removeObserver(baiduSite);
		System.out.println();
		System.out.println("****�Ƴ��ٶ�****");
		System.out.println("֪ͨ����ע��Ĺ۲���, ������Ϣ");
		weatherData.setData(29f, 100f, 3f);
	}
}
