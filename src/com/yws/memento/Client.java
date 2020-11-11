package com.yws.memento;

public class Client {
	public static void main(String[] args) {
		//创建游戏角色
		GameRole role = new GameRole();
		role.setVit(100);
		role.setDef(200);
		
		System.out.println("和Boss大战前的状态");
		role.display();
		
		//把当前状态保存caretaker
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(role.createMemento());
		
		System.out.println("和BOSS大战~~~~");
		role.setVit(30);
		role.setDef(30);	
		role.display();
		
		System.out.println("大战后，使用备忘录恢复到战前");
		role.recoverGameRoleFromMemento(careTaker.getMemento());
		System.out.println("恢复后的状态");
		role.display();
		
	}
}
