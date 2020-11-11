package com.yws.memento;

public class Client {
	public static void main(String[] args) {
		//������Ϸ��ɫ
		GameRole role = new GameRole();
		role.setVit(100);
		role.setDef(200);
		
		System.out.println("��Boss��սǰ��״̬");
		role.display();
		
		//�ѵ�ǰ״̬����caretaker
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(role.createMemento());
		
		System.out.println("��BOSS��ս~~~~");
		role.setVit(30);
		role.setDef(30);	
		role.display();
		
		System.out.println("��ս��ʹ�ñ���¼�ָ���սǰ");
		role.recoverGameRoleFromMemento(careTaker.getMemento());
		System.out.println("�ָ����״̬");
		role.display();
		
	}
}
