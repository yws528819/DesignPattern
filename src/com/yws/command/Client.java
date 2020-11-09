package com.yws.command;

public class Client {
	public static void main(String[] args) {
		//ʹ���������ģʽ�����ͨ��ң�������Ե�ƵĲ���
		RemoteController remoteController = new RemoteController();
		//������ƵĶ���(������)
		LightReciever lightReciever = new LightReciever();
		//ң�����������ǵ�ң������������, ���� no = 0 �ǵ�ƵĿ��͹صĲ���
		remoteController.setCommand(0, new LightOnCommand(lightReciever), new LightOffCommand(lightReciever));
		System.out.println("--------���µƵĿ���ť-----------");
		remoteController.onButtonWasPushed(0);
		System.out.println("--------���µƵĹذ�ť-----------");
		remoteController.offButtonWasPushed(0);
		System.out.println("--------���µƵĳ�����ť-----------");
		remoteController.undoButtonPushed();
		
		//ʹ��ң������������
		System.out.println("===========ʹ��ң������������=========");
		
		TVReceiver tvReceiver = new TVReceiver();
		//�����ǵ�ң������������, ���� no = 1 �ǵ��ӻ��Ŀ��͹صĲ���
		remoteController.setCommand(1, new TVOncommand(tvReceiver), new TVOffCommand(tvReceiver));
		System.out.println("--------���µ��ӻ��Ŀ���ť-----------");
		remoteController.onButtonWasPushed(1);
		System.out.println("--------���µ��ӻ��Ĺذ�ť-----------");
		remoteController.offButtonWasPushed(1);
		System.out.println("--------���µ��ӻ��ĳ�����ť-----------");
		remoteController.undoButtonPushed();
		
	}
}
