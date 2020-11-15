package com.yws.strategy;

public abstract class Duck {
	
	//属性 策略接口
	FlyBehavior flyBehavior;
	//其他属性 策略接口
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public void fly() {
		if (flyBehavior != null) {
			flyBehavior.fly();
		}
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	//显示鸭子信息
	public abstract void display();
	
}
