package com.yws.decorator;

public class Decorator extends Drink{

	private Drink drink;
	
	public Decorator(Drink drink) {
		super();
		this.drink = drink;
	}



	@Override
	public String getDesc() {
		return super.getDesc() + " " + getPrice() + "&&" + drink.getDesc();
	}


	@Override
	public float cost() {
		return getPrice() + drink.cost();
	}
}
