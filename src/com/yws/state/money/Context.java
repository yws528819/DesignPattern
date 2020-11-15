package com.yws.state.money;

public class Context extends AbstractState{
	State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	

	@Override
	public void checkEvent(Context context) {
		state.checkEvent(this);
		getCurrentState();
	}

	@Override
	public void checkFailEvent(Context context) {
		state.checkFailEvent(this);
		getCurrentState();
	}

	@Override
	public void makePriceEvent(Context context) {
		state.makePriceEvent(this);
		getCurrentState();
		
	}

	@Override
	public void acceptOrderEvent(Context context) {
		state.acceptOrderEvent(this);
		getCurrentState();
	}

	@Override
	public void noPeopleAcceptEvent(Context context) {
		state.noPeopleAcceptEvent(this);
		getCurrentState();
	}

	@Override
	public void payOrderEvent(Context context) {
		state.payOrderEvent(this);
		getCurrentState();
	}

	@Override
	public void orderFailureEvent(Context context) {
		state.orderFailureEvent(this);
		getCurrentState();
	}

	@Override
	public void feedBackEvent(Context context) {
		state.feedBackEvent(this);
		getCurrentState();
	}

	@Override
	public String getCurrentState() {
		System.out.println("µ±Ç°×´Ì¬£º" + state.getCurrentState());
		return state.getCurrentState();
	}
	
	
}
