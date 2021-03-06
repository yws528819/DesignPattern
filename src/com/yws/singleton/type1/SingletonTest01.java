package com.yws.singleton.type1;


public class SingletonTest01 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1的hashcode=" + singleton1.hashCode());
		System.out.println("singleton2的hashcode=" + singleton2.hashCode());
	}
}


//饿汉式（静态代码块）
class Singleton {
	
	//1.构造器私有化，外部不能new
	private Singleton() {
		
	}
	
	//2.本类内部创建对象实例
	private static Singleton singleton;
	
	static {//在静态代码块中，创建单例对象
		singleton = new Singleton();
	}
	
	//3.提供一个公有的静态方法，返回实例对象
	public static Singleton getIntance() {
		return singleton;
	}
}