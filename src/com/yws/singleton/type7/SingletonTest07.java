package com.yws.singleton.type7;


public class SingletonTest07 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1��hashcode=" + singleton1.hashCode());
		System.out.println("singleton2��hashcode=" + singleton2.hashCode());
	}
}


//��̬�ڲ��෽ʽ
//1.��̬�ڲ��಻�������ⲿ�����װ�ض�װ��
//2.����getIntance���������SingletonInstance��ľ�̬���Ե�ʱ�򣬾�̬�ڲ���Żᱻװ�أ�ֻ�ᱻװ��һ��
//��ʱ��Ż�ʵ����Singleton�����̰߳�ȫ��
class Singleton {
	
	private Singleton() {}
	
	static class SingletonInstance {
		private static Singleton singleton = new Singleton();
	}
	

	public static Singleton getIntance() {
		return SingletonInstance.singleton;
	}
}