package com.yws.decorator;

//�����Decorator��������ǵ�ζƷ
public class Chocolate extends Decorator{

	public Chocolate(Drink drink) {
		super(drink);
		setDesc(" �ɿ� �� ");
		setPrice(3.0f);
	}
}
