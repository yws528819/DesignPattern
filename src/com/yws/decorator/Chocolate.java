package com.yws.decorator;

//具体的Decorator，这里就是调味品
public class Chocolate extends Decorator{

	public Chocolate(Drink drink) {
		super(drink);
		setDesc(" 巧克 力 ");
		setPrice(3.0f);
	}
}
