package com.yws.singleton.type3;


public class SingletonTest03 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1的hashcode=" + singleton1.hashCode());
		System.out.println("singleton2的hashcode=" + singleton2.hashCode());
	}
}


//懒汉式（线程不安全）
class Singleton {
	
	private Singleton() {}
	
	private static Singleton singleton;
	
	//提供一个静态的公有方法，当使用该方法时，才去创建instance
	//即懒汉式
	public static Singleton getIntance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}