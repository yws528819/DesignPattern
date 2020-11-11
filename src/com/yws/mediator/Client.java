package com.yws.mediator;

public class Client {
	public static void main(String[] args) {
		//����һ���н��߶���
		Mediator mediator = new ConcreteMediator();
		
		//����Alarm ���Ҽ��뵽 ConcreteMediator �����HashMap
		Alarm alarm = new Alarm(mediator, "alarm");
		
		//����CoffeeMachine ���Ҽ��뵽ConcreteMediator �����HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		
		//����TV ���Ҽ��뵽ConcreteMediator �����HashMap
		TV tv = new TV(mediator, "tv");
		
		//����Curtains ���Ҽ��뵽ConcreteMediator �����HashMap
		Curtains curtains = new Curtains(mediator, "curtains");
		
		//�����ӷ���Ϣ
		alarm.sendMessage(0);
		coffeeMachine.finishCoffee();
		alarm.sendMessage(1);
	}
}
