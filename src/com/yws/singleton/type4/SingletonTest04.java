package com.yws.singleton.type4;


public class SingletonTest04 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1��hashcode=" + singleton1.hashCode());
		System.out.println("singleton2��hashcode=" + singleton2.hashCode());
	}
}


//����ʽ���̰߳�ȫ��ͬ��������
class Singleton {
	
	private Singleton() {}
	
	private static Singleton singleton;
	
	//�ṩһ����̬�Ĺ��з���������ͬ������Ĵ��룬����̰߳�ȫ����
	//������ʽ
	public static synchronized Singleton getIntance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}