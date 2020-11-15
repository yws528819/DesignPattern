package com.yws.state;

/**
 * ���ܳ齱״̬
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
		System.out.println("�۳�50���ֳɹ��������Գ齱��");
		activity.setState(activity.getCanRaffleState());
	}

	@Override
	public boolean raffle() {
		System.out.println("���˻��ֲ��ܳ齱�ޣ�");
		return false;
	}

	
	@Override
	public void dispensePrize() {
		System.out.println("���ܷ��Ž�Ʒ");
	}

}
