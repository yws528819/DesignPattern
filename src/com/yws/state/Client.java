package com.yws.state;

public class Client {
	public static void main(String[] args) {
		RaffleActivity raffleActivity = new RaffleActivity(2);
		
		for (int i=0; i<30; i++) {
			if (raffleActivity.count == 0) {
				System.out.println("��Ʒ������ϣ��������");
				break;
			}
			System.out.println("------��" + (i+1) + "�γ齱----------");
			//�μӳ齱����һ������۳�����
			raffleActivity.debuctMoney();
			//�ڶ����齱
			raffleActivity.raffle();
		}
	}
}
