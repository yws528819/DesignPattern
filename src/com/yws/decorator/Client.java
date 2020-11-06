package com.yws.decorator;

public class Client {
	public static void main(String[] args) {
		System.out.println("��һ�ε�����>>>");
		// װ����ģʽ�µĶ�����2���ɿ���+һ��ţ�̵�LongBlack
		Drink drink = new LongBlack();
		System.out.println("����=" + drink.cost());
		System.out.println("����=" + drink.getDesc());
		
		drink = new Milk(drink);
		System.out.println("����=" + drink.cost());
		System.out.println("����=" + drink.getDesc());		

		drink = new Chocolate(drink);
		System.out.println("����=" + drink.cost());
		System.out.println("����=" + drink.getDesc());		
		
		drink = new Chocolate(drink);
		System.out.println("����=" + drink.cost());
		System.out.println("����=" + drink.getDesc());	
		
		System.out.println("======================");
		
		System.out.println("�ڶ��ε�����>>>");
		
		Drink drink2 = new DeCafe();
		System.out.println("����=" + drink2.cost());
		System.out.println("����=" + drink2.getDesc());
		
		drink2 = new Soy(drink2);
		System.out.println("����=" + drink2.cost());
		System.out.println("����=" + drink2.getDesc());
	}
}
