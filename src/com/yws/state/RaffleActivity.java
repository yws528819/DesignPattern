package com.yws.state;

public class RaffleActivity {
	//state 表示活动当前的状态，是变化的
	State state = null;
	//奖品数量
	int count = 0;
	
	//四个属性，表示四种状态
	State noRaffleState = new NoRaffleState(this);
	State canRaffleState = new CanRaffleState(this);
	State dispensState = new DispenseState(this);
	State dispenseOutState = new DispenseOutState(this);
	
    //构造器
    //1. 初始化当前的状态为 noRafflleState（即不能抽奖的状态）
    //2. 初始化奖品的数量 	
	public RaffleActivity(int count) {
		this.state = getNoRaffleState();
		this.count = count;
	}
	
	//扣分
	public void debuctMoney() {
		state.deductMoney();
	}
	
	//抽奖
	public void raffle() {
		if (state.raffle()) {
			state.dispensePrize();
		}
	}
	
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getCount() {
		int curCount  = count;
		count --;
		return curCount;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public State getNoRaffleState() {
		return noRaffleState;
	}
	public void setNoRaffleState(State noRaffleState) {
		this.noRaffleState = noRaffleState;
	}
	public State getCanRaffleState() {
		return canRaffleState;
	}
	public void setCanRaffleState(State canRaffleState) {
		this.canRaffleState = canRaffleState;
	}
	public State getDispensState() {
		return dispensState;
	}
	public void setDispensState(State dispensState) {
		this.dispensState = dispensState;
	}
	public State getDispenseOutState() {
		return dispenseOutState;
	}
	public void setDispenseOutState(State dispenseOutState) {
		this.dispenseOutState = dispenseOutState;
	}
	
}
