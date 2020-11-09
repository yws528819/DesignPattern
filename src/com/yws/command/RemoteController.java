package com.yws.command;

public class RemoteController {
	//���ذ�ť����������
	Command[] onCommands;
	Command[] offCommands;
	//ִ�г���������
	Command undoCommand;

	public RemoteController() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		
		for(int i=0; i<5; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}
	
	//�����ǵİ�ť������Ҫ������
	public void setCommand(int no, Command onCommand, Command offCommand) {
		onCommands[no] = onCommand;
		offCommands[no] = offCommand;
	}
	
	//���¿���ť 
	public void onButtonWasPushed(int no) {
		onCommands[no].execute();
		undoCommand = onCommands[no];
	}
	
	//���¹ذ�ť
	public void offButtonWasPushed(int no) {
		offCommands[no].execute();
		undoCommand = offCommands[no];
	}
	
	//���³�����ť
	public void undoButtonPushed() {
		undoCommand.undo();
	}
	
}
