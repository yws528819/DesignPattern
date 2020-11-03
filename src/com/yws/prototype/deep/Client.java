package com.yws.prototype.deep;

public class Client {
	public static void main(String[] args) throws Exception {
		System.out.println("原型模式完成对象的创建");
		Sheep sheep = new Sheep("tom", 1, "白色");
		
		sheep.friend = new Fish("小花");
		
//		Sheep sheep1 = (Sheep) sheep.clone();
//		Sheep sheep2 = (Sheep) sheep.clone();
		
		//序列化的方式测试
		Sheep sheep1 = (Sheep) sheep.deepClone();
		Sheep sheep2 = (Sheep) sheep.deepClone();
		
		
		System.out.println("sheep1.hashcode:" + sheep1.hashCode());
		System.out.println("sheep2.hashcode:" + sheep2.hashCode());
		
		System.out.println("sheep1.friend.hashcode:" + sheep1.friend.hashCode());
		System.out.println("sheep2.friend.hashcode:" + sheep2.friend.hashCode());

	}
}
