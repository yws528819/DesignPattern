package com.yws.singleton.type2;


public class SingletonTest02 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1��hashcode=" + singleton1.hashCode());
		System.out.println("singleton2��hashcode=" + singleton2.hashCode());
	}
}


//����ʽ����̬������
class Singleton {
	
	//1.������˽�л����ⲿ����new
	private Singleton() {
		
	}
	
	//2.�����ڲ���������ʵ��
	private static Singleton singleton = new Singleton();
	
	
	//3.�ṩһ�����еľ�̬����������ʵ������
	public static Singleton getIntance() {
		return singleton;
	}
}