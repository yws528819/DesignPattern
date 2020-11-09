package com.yws.command;

public class LightOffCommand implements Command{

	private LightReciever lightReceiver;
	public LightOffCommand(LightReciever lightReceiver) {
		super();
		this.lightReceiver = lightReceiver;
	}

	@Override
	public void execute() {
		lightReceiver.off();
		
	}

	@Override
	public void undo() {
		lightReceiver.on();
	}
}
