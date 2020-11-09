package com.yws.command;

public class Client {
	public static void main(String[] args) {
		//使用命令设计模式，完成通过遥控器，对电灯的操作
		RemoteController remoteController = new RemoteController();
		//创建电灯的对象(接受者)
		LightReciever lightReciever = new LightReciever();
		//遥控器，给我们的遥控器设置命令, 比如 no = 0 是电灯的开和关的操作
		remoteController.setCommand(0, new LightOnCommand(lightReciever), new LightOffCommand(lightReciever));
		System.out.println("--------按下灯的开按钮-----------");
		remoteController.onButtonWasPushed(0);
		System.out.println("--------按下灯的关按钮-----------");
		remoteController.offButtonWasPushed(0);
		System.out.println("--------按下灯的撤销按钮-----------");
		remoteController.undoButtonPushed();
		
		//使用遥控器操作电视
		System.out.println("===========使用遥控器操作电视=========");
		
		TVReceiver tvReceiver = new TVReceiver();
		//给我们的遥控器设置命令, 比如 no = 1 是电视机的开和关的操作
		remoteController.setCommand(1, new TVOncommand(tvReceiver), new TVOffCommand(tvReceiver));
		System.out.println("--------按下电视机的开按钮-----------");
		remoteController.onButtonWasPushed(1);
		System.out.println("--------按下电视机的关按钮-----------");
		remoteController.offButtonWasPushed(1);
		System.out.println("--------按下电视机的撤销按钮-----------");
		remoteController.undoButtonPushed();
		
	}
}
