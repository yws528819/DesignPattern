package com.yws.singleton.type2;


public class SingletonTest02 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1的hashcode=" + singleton1.hashCode());
		System.out.println("singleton2的hashcode=" + singleton2.hashCode());
	}
}


//饿汉式（静态变量）
class Singleton {
	
	//1.构造器私有化，外部不能new
	private Singleton() {
		
	}
	
	//2.本类内部创建对象实例
	private static Singleton singleton = new Singleton();
	
	
	//3.提供一个公有的静态方法，返回实例对象
	public static Singleton getIntance() {
		return singleton;
	}
}