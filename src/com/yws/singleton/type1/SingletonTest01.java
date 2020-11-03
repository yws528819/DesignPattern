package com.yws.singleton.type1;


public class SingletonTest01 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1��hashcode=" + singleton1.hashCode());
		System.out.println("singleton2��hashcode=" + singleton2.hashCode());
	}
}


//����ʽ����̬����飩
class Singleton {
	
	//1.������˽�л����ⲿ����new
	private Singleton() {
		
	}
	
	//2.�����ڲ���������ʵ��
	private static Singleton singleton;
	
	static {//�ھ�̬������У�������������
		singleton = new Singleton();
	}
	
	//3.�ṩһ�����еľ�̬����������ʵ������
	public static Singleton getIntance() {
		return singleton;
	}
}