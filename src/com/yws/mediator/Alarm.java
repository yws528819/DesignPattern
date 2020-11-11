package com.yws.mediator;

//具体的同事类
public class Alarm extends Colleague{
	
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//创建Alarm同事对象时，将自己放入到ConcreteMediator对象中（集合）
		mediator.register(name, this);
	}
	
	public void setAlarm(int stateChange) {
		sendMessage(stateChange);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, this.name);
	}

}
