package com.yws.state;

public class RaffleActivity {
	//state ��ʾ���ǰ��״̬���Ǳ仯��
	State state = null;
	//��Ʒ����
	int count = 0;
	
	//�ĸ����ԣ���ʾ����״̬
	State noRaffleState = new NoRaffleState(this);
	State canRaffleState = new CanRaffleState(this);
	State dispensState = new DispenseState(this);
	State dispenseOutState = new DispenseOutState(this);
	
    //������
    //1. ��ʼ����ǰ��״̬Ϊ noRafflleState�������ܳ齱��״̬��
    //2. ��ʼ����Ʒ������ 	
	public RaffleActivity(int count) {
		this.state = getNoRaffleState();
		this.count = count;
	}
	
	//�۷�
	public void debuctMoney() {
		state.deductMoney();
	}
	
	//�齱
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
