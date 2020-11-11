package com.yws.mediator;

public class Client {
	public static void main(String[] args) {
		//创建一个中介者对象
		Mediator mediator = new ConcreteMediator();
		
		//创建Alarm 并且加入到 ConcreteMediator 对象的HashMap
		Alarm alarm = new Alarm(mediator, "alarm");
		
		//创建CoffeeMachine 并且加入到ConcreteMediator 对象的HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		
		//创建TV 并且加入到ConcreteMediator 对象的HashMap
		TV tv = new TV(mediator, "tv");
		
		//创建Curtains 并且加入到ConcreteMediator 对象的HashMap
		Curtains curtains = new Curtains(mediator, "curtains");
		
		//让闹钟发消息
		alarm.sendMessage(0);
		coffeeMachine.finishCoffee();
		alarm.sendMessage(1);
	}
}
