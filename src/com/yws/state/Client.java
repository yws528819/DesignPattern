package com.yws.state;

public class Client {
	public static void main(String[] args) {
		RaffleActivity raffleActivity = new RaffleActivity(2);
		
		for (int i=0; i<30; i++) {
			if (raffleActivity.count == 0) {
				System.out.println("奖品发送完毕，活动结束！");
				break;
			}
			System.out.println("------第" + (i+1) + "次抽奖----------");
			//参加抽奖，第一步点击扣除积分
			raffleActivity.debuctMoney();
			//第二步抽奖
			raffleActivity.raffle();
		}
	}
}
