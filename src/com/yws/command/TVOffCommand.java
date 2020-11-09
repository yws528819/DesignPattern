package com.yws.command;

public class TVOffCommand implements Command{
	
	private TVReceiver tvReceiver;
	public TVOffCommand(TVReceiver tvReceiver) {
		super();
		this.tvReceiver = tvReceiver;
	}

	@Override
	public void execute() {
		tvReceiver.off();
	}

	@Override
	public void undo() {
		tvReceiver.on();
	}

}
