package com.yws.singleton.type4;


public class SingletonTest04 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1的hashcode=" + singleton1.hashCode());
		System.out.println("singleton2的hashcode=" + singleton2.hashCode());
	}
}


//懒汉式（线程安全，同步方法）
class Singleton {
	
	private Singleton() {}
	
	private static Singleton singleton;
	
	//提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
	//即懒汉式
	public static synchronized Singleton getIntance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}