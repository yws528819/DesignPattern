package com.yws.state;

/**
 * ��Ʒ������ϵ�״̬
 * ˵����������activity�ı�� DispenseOutState���齱�����
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
		System.out.println("��Ʒ�������ˣ����´βμ�");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("��Ʒ�������ˣ����´βμ�");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("��Ʒ�������ˣ����´βμ�");
		
	}

}
