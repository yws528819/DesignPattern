package com.yws.state;

/**
 * ���Ž�Ʒ��״̬
 * @author mayn
 *
 */
public class DispenseState extends State{

	// ��ʼ��ʱ�������ã����Ž�Ʒ��ı���״̬
	RaffleActivity activity;
	
	public DispenseState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}

	@Override
	public void deductMoney() {
		System.out.println("���ܿ۳�����");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("���ܳ齱");
		return false;
	}

	@Override
	public void dispensePrize() {
		int count = activity.getCount();
		if (count > 0) {
			System.out.println("��ϲ�н���");
			activity.setState(activity.getNoRaffleState());
			if (count == 1) {//���һ����Ʒ�����ˣ��ı�״̬Ϊ��Ʒ������ϣ��������ǾͲ��齱��
				activity.setState(activity.getDispenseOutState());
			}
		}
//		else {
//			System.out.println("���ź�����Ʒ��������");
//			//�ı�״̬Ϊ��Ʒ������ϣ��������ǾͲ��齱��
//			activity.setState(activity.getDispenseOutState());
//		}
	}

}
