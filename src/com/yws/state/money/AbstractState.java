package com.yws.state.money;

public abstract class AbstractState implements State{

	protected static final RuntimeException EXCEPTION = new RuntimeException("�������̲�����");
	
	//������Ĭ��ʵ����state�ӿڵ����з���
	//��������з����������ࣨ����ʵ���ࣩ������ѡ��Ľ�����д
	
	@Override
	public void checkEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public void checkFailEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public void makePriceEvent(Context context) {
		throw EXCEPTION;
		
	}

	@Override
	public void acceptOrderEvent(Context context) {
		throw EXCEPTION;
		
	}

	@Override
	public void noPeopleAcceptEvent(Context context) {
		throw EXCEPTION;
	}

	@Override
	public void payOrderEvent(Context context) {
		throw EXCEPTION;		
		
	}

	@Override
	public void orderFailureEvent(Context context) {
		throw EXCEPTION;		
		
	}

	@Override
	public void feedBackEvent(Context context) {
		throw EXCEPTION;		
		
	}
	
}
