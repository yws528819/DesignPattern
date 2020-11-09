package com.yws.command;

public class RemoteController {
	//开关按钮的命令数组
	Command[] onCommands;
	Command[] offCommands;
	//执行撤销的命令
	Command undoCommand;

	public RemoteController() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		
		for(int i=0; i<5; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}
	
	//给我们的按钮设置需要的命令
	public void setCommand(int no, Command onCommand, Command offCommand) {
		onCommands[no] = onCommand;
		offCommands[no] = offCommand;
	}
	
	//按下开按钮 
	public void onButtonWasPushed(int no) {
		onCommands[no].execute();
		undoCommand = onCommands[no];
	}
	
	//按下关按钮
	public void offButtonWasPushed(int no) {
		offCommands[no].execute();
		undoCommand = offCommands[no];
	}
	
	//按下撤销按钮
	public void undoButtonPushed() {
		undoCommand.undo();
	}
	
}
