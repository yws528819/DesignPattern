package com.yws.command;

public class LightOnCommand implements Command{
	
	private LightReciever lightReceiver;
	

	public LightOnCommand(LightReciever lightReceiver) {
		super();
		this.lightReceiver = lightReceiver;
	}

	@Override
	public void execute() {
		//调用接收者的方法
		lightReceiver.on();
		
	}

	@Override
	public void undo() {
		//调用接收者的方法
		lightReceiver.off();
	}

}
