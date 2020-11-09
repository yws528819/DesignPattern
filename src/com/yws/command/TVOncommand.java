package com.yws.command;

public class TVOncommand implements Command{

	private TVReceiver tvReceiver;
	
	public TVOncommand(TVReceiver tvReceiver) {
		super();
		this.tvReceiver = tvReceiver;
	}

	@Override
	public void execute() {
		tvReceiver.on();
	}

	@Override
	public void undo() {
		tvReceiver.off();
	}

}
