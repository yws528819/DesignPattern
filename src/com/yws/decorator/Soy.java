package com.yws.decorator;

public class Soy extends Decorator{

	public Soy(Drink drink) {
		super(drink);
		setDesc(" ���� ");
		setPrice(1.0f);
	}
}
