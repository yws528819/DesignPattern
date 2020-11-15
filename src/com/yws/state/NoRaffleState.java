package com.yws.state;

/**
 * 不能抽奖状态
 * @author mayn
 *
 */
public class NoRaffleState extends State{

	RaffleActivity activity;
	
	public NoRaffleState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}

	@Override
	public void deductMoney() {
		System.out.println("扣除50积分成功，您可以抽奖了");
		activity.setState(activity.getCanRaffleState());
	}

	@Override
	public boolean raffle() {
		System.out.println("扣了积分才能抽奖噢！");
		return false;
	}

	
	@Override
	public void dispensePrize() {
		System.out.println("不能发放奖品");
	}

}
