package com.yws.decorator;

public class Milk extends Decorator{

	public Milk(Drink drink) {
		super(drink);
		setDesc(" еёдл   ");
		setPrice(1.5f);
	}
}
