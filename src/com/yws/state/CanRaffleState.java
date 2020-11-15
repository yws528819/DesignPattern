package com.yws.state;

import java.util.Random;

/**
 * 可以抽奖的状态
 * @author mayn
 *
 */
public class CanRaffleState extends State{

	RaffleActivity activity;
	
	public CanRaffleState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}

	//已经扣除了积分，不能再扣
	@Override
	public void deductMoney() {
		System.out.println("已经扣取过了积分");
	}

	//可以抽奖，抽奖完后，根据实际情况，改成新的状态
	@Override
	public boolean raffle() {
		System.out.println("正在抽奖，请稍后！");
		 // 10%中奖机会
		int num = new Random().nextInt(10);
		if (num == 0) {
			//改变活动状态为发放奖品 context
			activity.setState(activity.getDispensState());
			return true;
		}else {
			System.out.println("很遗憾，您没有抽中奖品！");
			//改变状态为不能抽奖
			activity.setState(activity.getNoRaffleState());
			return false;
		}
	}

	// 不能发放奖品
	@Override
	public void dispensePrize() {
		System.out.println("没中奖，不能发放奖品");
	}

}
