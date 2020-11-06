package com.yws.decorator;

public class Client {
	public static void main(String[] args) {
		System.out.println("第一次点饮料>>>");
		// 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack
		Drink drink = new LongBlack();
		System.out.println("费用=" + drink.cost());
		System.out.println("描述=" + drink.getDesc());
		
		drink = new Milk(drink);
		System.out.println("费用=" + drink.cost());
		System.out.println("描述=" + drink.getDesc());		

		drink = new Chocolate(drink);
		System.out.println("费用=" + drink.cost());
		System.out.println("描述=" + drink.getDesc());		
		
		drink = new Chocolate(drink);
		System.out.println("费用=" + drink.cost());
		System.out.println("描述=" + drink.getDesc());	
		
		System.out.println("======================");
		
		System.out.println("第二次点饮料>>>");
		
		Drink drink2 = new DeCafe();
		System.out.println("费用=" + drink2.cost());
		System.out.println("描述=" + drink2.getDesc());
		
		drink2 = new Soy(drink2);
		System.out.println("费用=" + drink2.cost());
		System.out.println("描述=" + drink2.getDesc());
	}
}
