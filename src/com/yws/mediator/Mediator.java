package com.yws.mediator;

public abstract class Mediator {
	//���н��߶�����뵽������
	public abstract void register(String colleagueName, Colleague colleague);
	
	//������Ϣ�������ͬ�¶��󷢳�
	public abstract void getMessage(int stateChange, String colleagueName);
	
	public abstract void sendMessage();
}
