package com.yws.state.money;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		//将当前状态设置为 PublishState
		context.setState(new PublishedState());
		context.getCurrentState();
		//publish --> not pay
		context.acceptOrderEvent(context);
		//not pay --> paid
		context.payOrderEvent(context);
	}
}
