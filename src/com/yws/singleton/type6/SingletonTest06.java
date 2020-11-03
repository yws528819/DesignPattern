package com.yws.singleton.type6;


public class SingletonTest06 {
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
	
	private static volatile Singleton singleton;
	
	//�ṩһ����̬�Ĺ��з���������˫�ؼ����룬����̰߳�ȫ���⣬ͬʱ�������������
	//ͬʱ��֤��Ч��
	public static Singleton getIntance() {
		if (singleton == null) {
			synchronized(Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}