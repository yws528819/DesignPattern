package com.yws.command;

public class LightOnCommand implements Command{
	
	private LightReciever lightReceiver;
	

	public LightOnCommand(LightReciever lightReceiver) {
		super();
		this.lightReceiver = lightReceiver;
	}

	@Override
	public void execute() {
		//���ý����ߵķ���
		lightReceiver.on();
		
	}

	@Override
	public void undo() {
		//���ý����ߵķ���
		lightReceiver.off();
	}

}
