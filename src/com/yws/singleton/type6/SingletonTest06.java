package com.yws.singleton.type6;


public class SingletonTest06 {
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
	
	private static volatile Singleton singleton;
	
	//提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
	//同时保证了效率
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