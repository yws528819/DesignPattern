package com.yws.strategy;

public abstract class Duck {
	
	//���� ���Խӿ�
	FlyBehavior flyBehavior;
	//�������� ���Խӿ�
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
	
	//��ʾѼ����Ϣ
	public abstract void display();
	
}
