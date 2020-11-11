package com.yws.mediator;

//�����ͬ����
public class Alarm extends Colleague{
	
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//����Alarmͬ�¶���ʱ�����Լ����뵽ConcreteMediator�����У����ϣ�
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
