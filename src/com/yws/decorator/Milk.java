package com.yws.decorator;

public class Milk extends Decorator{

	public Milk(Drink drink) {
		super(drink);
		setDesc(" ţ��   ");
		setPrice(1.5f);
	}
}
