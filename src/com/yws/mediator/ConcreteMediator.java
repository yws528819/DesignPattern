package com.yws.mediator;

import java.util.HashMap;
import java.util.Map;

//������н�����
public class ConcreteMediator extends Mediator{

	//���ϣ��������е�ͬ�¶���
	private Map<String, Colleague> colleagueMap;
	private Map<String, String> interMap;
	
	public ConcreteMediator() {
		colleagueMap = new HashMap<String, Colleague>();
		interMap = new HashMap<String, String>();
	}
	
	
	@Override
	public void register(String colleagueName, Colleague colleague) {
		colleagueMap.put(colleagueName, colleague);
		
		if (colleague instanceof Alarm) {
			interMap.put("Alarm", colleagueName);
		}else if (colleague instanceof CoffeeMachine) {
			interMap.put("CoffeeMachine", colleagueName);
		}else if (colleague instanceof TV) {
			interMap.put("TV", colleagueName);
		}else if (colleague instanceof Curtains) {
			interMap.put("Curtains", colleagueName);
		}
		
		
		
	}

	//�����н��ߵĺ��ķ���
	//1.���ݵõ���Ϣ����ɶ�Ӧ������
	//2.�н��������������ȥЭ�����������ͬ�¶�����ɵ�����
	@Override
	public void getMessage(int stateChange, String colleagueName) {
		//�������ӷ�������Ϣ
		Colleague colleague = colleagueMap.get(colleagueName);
		if (colleague instanceof Alarm) {
			
			CoffeeMachine coffeeMachine = (CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"));
			TV tv = (TV) colleagueMap.get(interMap.get("TV"));
			
			if (stateChange == 0) {
				coffeeMachine.startCoffee();
				tv.startTV();
			}else {
				tv.stopTV();
			}
			
		}else if (colleague instanceof CoffeeMachine) {
			Curtains curtains = (Curtains) colleagueMap.get(interMap.get("Curtains"));
			
			curtains.upCurtains();
		}else if (colleague instanceof TV) {//���TV������Ϣ
			
		}else if (colleague instanceof Curtains) {
			//������Դ�����������Ϣ�����ﴦ��...
		}
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		
	}

}
