package com.yws.state.money;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		//����ǰ״̬����Ϊ PublishState
		context.setState(new PublishedState());
		context.getCurrentState();
		//publish --> not pay
		context.acceptOrderEvent(context);
		//not pay --> paid
		context.payOrderEvent(context);
	}
}
