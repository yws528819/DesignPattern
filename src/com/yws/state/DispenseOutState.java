package com.yws.state;

/**
 * 奖品发放完毕的状态
 * 说明：当我们activity改变成 DispenseOutState，抽奖活动结束
 * @author mayn
 *
 */
public class DispenseOutState extends State{

	RaffleActivity activity;
	
	public DispenseOutState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}

	@Override
	public void deductMoney() {
		System.out.println("奖品发送完了，请下次参加");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("奖品发送完了，请下次参加");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("奖品发送完了，请下次参加");
		
	}

}
