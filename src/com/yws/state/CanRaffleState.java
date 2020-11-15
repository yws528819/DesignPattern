package com.yws.state;

import java.util.Random;

/**
 * ���Գ齱��״̬
 * @author mayn
 *
 */
public class CanRaffleState extends State{

	RaffleActivity activity;
	
	public CanRaffleState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}

	//�Ѿ��۳��˻��֣������ٿ�
	@Override
	public void deductMoney() {
		System.out.println("�Ѿ���ȡ���˻���");
	}

	//���Գ齱���齱��󣬸���ʵ��������ĳ��µ�״̬
	@Override
	public boolean raffle() {
		System.out.println("���ڳ齱�����Ժ�");
		 // 10%�н�����
		int num = new Random().nextInt(10);
		if (num == 0) {
			//�ı�״̬Ϊ���Ž�Ʒ context
			activity.setState(activity.getDispensState());
			return true;
		}else {
			System.out.println("���ź�����û�г��н�Ʒ��");
			//�ı�״̬Ϊ���ܳ齱
			activity.setState(activity.getNoRaffleState());
			return false;
		}
	}

	// ���ܷ��Ž�Ʒ
	@Override
	public void dispensePrize() {
		System.out.println("û�н������ܷ��Ž�Ʒ");
	}

}
