package com.yws.prototype.deep;

public class Client {
	public static void main(String[] args) throws Exception {
		System.out.println("ԭ��ģʽ��ɶ���Ĵ���");
		Sheep sheep = new Sheep("tom", 1, "��ɫ");
		
		sheep.friend = new Fish("С��");
		
//		Sheep sheep1 = (Sheep) sheep.clone();
//		Sheep sheep2 = (Sheep) sheep.clone();
		
		//���л��ķ�ʽ����
		Sheep sheep1 = (Sheep) sheep.deepClone();
		Sheep sheep2 = (Sheep) sheep.deepClone();
		
		
		System.out.println("sheep1.hashcode:" + sheep1.hashCode());
		System.out.println("sheep2.hashcode:" + sheep2.hashCode());
		
		System.out.println("sheep1.friend.hashcode:" + sheep1.friend.hashCode());
		System.out.println("sheep2.friend.hashcode:" + sheep2.friend.hashCode());

	}
}
