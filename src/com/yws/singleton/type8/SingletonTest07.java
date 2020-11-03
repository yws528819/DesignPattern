package com.yws.singleton.type8;


public class SingletonTest07 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.INSTANCE;
		Singleton singleton2 = Singleton.INSTANCE;
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1的hashcode=" + singleton1.hashCode());
		System.out.println("singleton2的hashcode=" + singleton2.hashCode());
	}
}


//使用枚举，可以实现单例，推荐使用
enum Singleton {
	INSTANCE;//属性
	
	
	public void sayOK() {
		
	}
}

//
//enum Color{
//	RED("r"),
//	BLUE("b");
//	
//	
//	private String value;
//	
//	Color(String value) {
//		this.value = value;
//	}
//	
//	public String getValue() {
//		return this.value;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(Color.BLUE.getValue());
//	}
//}