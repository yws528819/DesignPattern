package com.yws.observer;

public class BaiduSite implements Observer{

	@Override
	public void update(float temperature, float pressure, float humidity) {
		System.out.println("===�ٶ���վ====");
		System.out.println("***�ٶ���վ  �¶�: " + temperature + "***");
		System.out.println("***�ٶ���վ  ��ѹ: " + pressure + "***");
		System.out.println("***�ٶ���վ  ʪ��: " + humidity + "***");
	}

}
