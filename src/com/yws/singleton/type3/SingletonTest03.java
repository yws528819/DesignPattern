package com.yws.singleton.type3;


public class SingletonTest03 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1��hashcode=" + singleton1.hashCode());
		System.out.println("singleton2��hashcode=" + singleton2.hashCode());
	}
}


//����ʽ���̲߳���ȫ��
class Singleton {
	
	private Singleton() {}
	
	private static Singleton singleton;
	
	//�ṩһ����̬�Ĺ��з�������ʹ�ø÷���ʱ����ȥ����instance
	//������ʽ
	public static Singleton getIntance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}