package com.yws.adapter.objectadapter;

public class Phone {

	public void charging(IVoltage5V voltage5v) {
		if (voltage5v.output5V() == 5) {
			System.out.println("��ѹΪ5V�����Գ��~~");
		}else if (voltage5v.output5V() > 5){
			System.out.println("��ѹ����5V�����ܳ��~~");
		}
	}
}
