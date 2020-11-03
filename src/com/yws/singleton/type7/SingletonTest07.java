package com.yws.singleton.type7;


public class SingletonTest07 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1的hashcode=" + singleton1.hashCode());
		System.out.println("singleton2的hashcode=" + singleton2.hashCode());
	}
}


//静态内部类方式
//1.静态内部类不会随着外部的类的装载而装载
//2.调用getIntance方法里面的SingletonInstance类的静态属性的时候，静态内部类才会被装载，只会被装载一次
//这时候才会实例化Singleton，是线程安全的
class Singleton {
	
	private Singleton() {}
	
	static class SingletonInstance {
		private static Singleton singleton = new Singleton();
	}
	

	public static Singleton getIntance() {
		return SingletonInstance.singleton;
	}
}