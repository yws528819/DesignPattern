package com.yws.state;

/**
 * 发放奖品的状态
 * @author mayn
 *
 */
public class DispenseState extends State{

	// 初始化时传入活动引用，发放奖品后改变其状态
	RaffleActivity activity;
	
	public DispenseState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}

	@Override
	public void deductMoney() {
		System.out.println("不能扣除积分");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("不能抽奖");
		return false;
	}

	@Override
	public void dispensePrize() {
		int count = activity.getCount();
		if (count > 0) {
			System.out.println("恭喜中奖了");
			activity.setState(activity.getNoRaffleState());
			if (count == 1) {//最后一个奖品抽完了，改变状态为奖品发送完毕，后面我们就不抽奖了
				activity.setState(activity.getDispenseOutState());
			}
		}
//		else {
//			System.out.println("很遗憾，奖品发送完了");
//			//改变状态为奖品发送完毕，后面我们就不抽奖了
//			activity.setState(activity.getDispenseOutState());
//		}
	}

}
