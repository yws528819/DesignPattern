package com.yws.mediator;

import java.util.HashMap;
import java.util.Map;

//具体的中介者类
public class ConcreteMediator extends Mediator{

	//集合，放入所有的同事对象
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

	//具体中介者的核心方法
	//1.根据得到消息，完成对应的任务
	//2.中介者在这个方法，去协调各个具体的同事对象，完成的任务
	@Override
	public void getMessage(int stateChange, String colleagueName) {
		//处理闹钟发出的消息
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
		}else if (colleague instanceof TV) {//如果TV发现消息
			
		}else if (colleague instanceof Curtains) {
			//如果是以窗帘发出的消息，这里处理...
		}
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		
	}

}
