package com.yws.state;

/**
 * ����״̬��
 * @author mayn
 *
 */
public abstract class State {
	//�۳�����  -50
	public abstract void deductMoney();
	
	//�Ƿ���н�Ʒ
	public abstract boolean raffle();
	
	//���Ž�Ʒ
	public abstract void dispensePrize();
}
